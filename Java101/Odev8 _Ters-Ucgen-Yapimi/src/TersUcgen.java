import java.util.Scanner;

public class TersUcgen {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Basamak Say�s� : ");
		int n = input.nextInt();
		
		for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

	}

}
