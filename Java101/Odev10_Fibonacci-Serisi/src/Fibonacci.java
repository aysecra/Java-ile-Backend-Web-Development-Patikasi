import java.util.Scanner;

public class Fibonacci {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Eleman Sayýsý: ");
		int n = input.nextInt();
		int num1 = 0, num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		for(int i = 0; i < n-2; i++) {
			System.out.print((num1 + num2) + " ");
			
			int temp = num1;
			num1 = num2;
			num2 += temp;
		}

	}

}
