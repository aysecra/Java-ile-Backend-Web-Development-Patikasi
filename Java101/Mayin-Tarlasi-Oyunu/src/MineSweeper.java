import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;

public class MineSweeper {
	private final int rowNumber, colNumber;
	private final int mineAmount;
	private String[][] field;
	private String[][] playField;
	private HashSet hs=new HashSet();
	
	public MineSweeper(int rowNumber, int colNumber){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		field = new String[rowNumber][colNumber];
		playField = new String[rowNumber][colNumber];
		mineAmount = (rowNumber * colNumber)/4;
	}
	
	private void setMineLocation() {
		Random rand = new Random();
		int ma = this.mineAmount;
		
		
		while(hs.size()<ma)
			hs.add(rand.nextInt(this.rowNumber * this.colNumber));
	}
	
	private void setMine() {
		String[][] arr = this.field;
		setMineLocation();
			
		Iterator it=hs.iterator();

		while(it.hasNext()){
			int mine = (int)it.next();
			arr[mine/this.colNumber][mine%this.colNumber] = "*";
		}
	}
	
	private void setArr() {
		setMine();
		String[][] arr = this.field;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == null)
					arr[i][j] = "-";
			}			
			for(int k = 0; k < arr.length; k++)
				for(int j = 0; j < arr[0].length; j++)
						this.playField[k][j] = "-";			
		}
		
		
	}
	
	private void printSum() {
		setArr();
		String[][] arr = this.field;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===========================");
		System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz !");
	}
	
	private void play() {
		String[][] arr = this.field;
		String[][] pArr = this.playField;
		int openedElements = 0;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			for(int k = 0; k < this.rowNumber; k++) {
				for(int j = 0; j < this.colNumber; j++)
					System.out.print(pArr[k][j] + " ");
				System.out.println();
			}
			
			if(openedElements == (this.rowNumber * this.colNumber) - this.mineAmount) {
				System.out.println("Oyunu Kazandýnýz ! \n"+
						   "===========================");
				break;
			}
			
			else {
				System.out.print("Satýr Giriniz : ");
				int row = input.nextInt();
				System.out.print("Sütun Giriniz : ");
				int col = input.nextInt();
				
				if(col > this.colNumber || row > this.rowNumber || col < 0 || row < 0) {
					System.out.println("Hatalý Satýr veya Sütun Deðeri Girdiniz.");
				}
				
				else if(arr[row][col] == "*") {
					System.out.println("Game Over!! \n"+
									   "===========================");
					break;
				}
				
				else {
					int numMine = 0;
					if(col-1>=0 && arr[row][col-1] == "*")
						numMine++;
					if(col+1<this.colNumber && arr[row][col+1] == "*")
						numMine++;
					if(row-1>=0 && arr[row-1][col] == "*")
						numMine++;
					if(row+1<this.rowNumber && arr[row+1][col] == "*")
						numMine++;
					if(row+1<this.rowNumber && col+1<this.colNumber && arr[row+1][col+1] == "*")
						numMine++;
					if(row+1<this.rowNumber && col-1>=0 && arr[row+1][col-1] == "*")
						numMine++;
					if(row-1>=0 && col+1<this.colNumber && arr[row-1][col+1] == "*")
						numMine++;
					if(row-1>=0 && col-1>=0 && arr[row-1][col-1] == "*")
						numMine++;
					
					pArr[row][col] = String.valueOf(numMine);
					openedElements++;
				}
				System.out.println("===========================");
			}
		}
	}
	
	public void run() {
		printSum();
		play();
	}
}
