import java.util.Scanner;

public class HarmonicNumbers {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double result = 0;
		System.out.print("Sayýyý giriniz: ");
		double n = input.nextInt();
		
		for(double i = 1; i <= n; i++)
			result += 1/i;

		System.out.println("Sonuç: " + result);

	}

}
