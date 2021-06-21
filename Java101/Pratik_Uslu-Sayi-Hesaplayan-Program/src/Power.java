import java.util.Scanner;

public class Power {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n,k, result = 1;
		System.out.print("Üssü alýnan sayý: ");
		n = input.nextInt();
		System.out.print("Üs: ");
		k = input.nextInt();
		
		for(int i = 0; i < k; i++)
			result *= n;
		
		System.out.println("Sonuç: " + result);

	}

}
