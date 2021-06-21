import java.util.Scanner;

public class FindNumbs {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int k, average = 0, amount = 0;
		System.out.print("Sayý Giriniz: ");
		k = input.nextInt();
		
		for(int i = 0; i < k; i++) 
			if(i % 3 == 0 && i % 4 == 0) {	//if(i % 12 == 0)
				amount++;
				average += i;
			}			
		
		System.out.println("Ortalama: " + average/amount);
		
	}

}
