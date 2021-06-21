import java.util.Scanner;

public class DeseneGoreMetot {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Sayý: ");
		int n = input.nextInt();
		metot(n, n, false);
	}
	
	static void metot(int first, int n, boolean control) {
		if(n <= 0) {
			System.out.print(n + " ");
			metot(first, n+5, true);
		}
		else if(control && n<=first) {
			System.out.print(n + " ");
			metot(first, n+5, true);
		}
		else if(!control) {
			System.out.print(n + " ");
			metot(first, n-5, false);
		}		
	}

}
