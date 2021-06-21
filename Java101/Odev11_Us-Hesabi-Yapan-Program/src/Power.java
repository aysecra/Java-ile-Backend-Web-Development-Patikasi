import java.util.Scanner;

public class Power {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Taban de�eri giriniz : ");
		int a = input.nextInt();
		System.out.print("�s de�erini giriniz : ");
		int n = input.nextInt();
		
		System.out.println("Sonu� : " + pow(a,n));

	}
	
	static int pow(int a, int n) {
		if(n == 0)
			return 1;
		return a*pow(a, (n-1));
	}

}
