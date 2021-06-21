import java.util.Scanner;

public class CiftVeDortunKatlariToplami {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n, sum = 0;
		do {
			System.out.print("Sayý: ");
			n = input.nextInt();
			if(n % 4 == 0)
				sum += n;
		}while(n % 2 == 0);
		
		System.out.println("Toplam: " + sum);
	}

}
