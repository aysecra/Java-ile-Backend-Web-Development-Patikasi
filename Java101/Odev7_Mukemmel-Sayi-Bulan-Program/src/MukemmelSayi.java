import java.util.Scanner;

public class MukemmelSayi {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Bir say� giriniz: ");
		int n = input.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n/2; i++)
			sum += (n % i == 0) ? i : 0;
		
		String message = (sum == n) ? (n + " M�kemmel say�d�r") : (n + " M�kemmel say� de�ildir.");
		System.out.println(message);
		
	}

}
