import java.util.Scanner;

public class Power {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Taban deðeri giriniz : ");
		int a = input.nextInt();
		System.out.print("Üs deðerini giriniz : ");
		int n = input.nextInt();
		
		System.out.println("Sonuç : " + pow(a,n));

	}
	
	static int pow(int a, int n) {
		if(n == 0)
			return 1;
		return a*pow(a, (n-1));
	}

}
