import java.util.Scanner;

public class PrimeNumber {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Say� Giriniz : ");
		int n = input.nextInt();
		
		isPrime(n, 2);
	}
	
	static void isPrime(int n, int i) {
		if(n == 2)
			System.out.println(n + " say�s� ASALDIR !");
		else if(i == n/2)
			if(n % i == 0)
				System.out.println(n + " say�s� ASAL de�ildir !");
			else System.out.println(n + " say�s� ASALDIR !");
		else if(n % i == 0)
			System.out.println(n + " say�s� ASAL de�ildir !");
		else isPrime(n, i+1);
			
		
	}

}
