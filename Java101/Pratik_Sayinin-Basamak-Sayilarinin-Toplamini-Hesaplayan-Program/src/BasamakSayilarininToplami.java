import java.util.Scanner;

public class BasamakSayilarininToplami {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Sayiyi giriniz: ");
		int n = input.nextInt();
		int result = 0;
		
		for(int i = n; i > 0; i /= 10) {
			int basValue = n % 10;
			n -= basValue;
			n /= 10;
			result += basValue;
		}
		System.out.println("Sonuç: " + result);

	}

}
