import java.util.Scanner;

public class Power {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n,k, result = 1;
		System.out.print("�ss� al�nan say�: ");
		n = input.nextInt();
		System.out.print("�s: ");
		k = input.nextInt();
		
		for(int i = 0; i < k; i++)
			result *= n;
		
		System.out.println("Sonu�: " + result);

	}

}
