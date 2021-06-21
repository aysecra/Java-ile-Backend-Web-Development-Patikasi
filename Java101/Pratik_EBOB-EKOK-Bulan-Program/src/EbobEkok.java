import java.util.Scanner;

public class EbobEkok {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("n1: ");
		int n1 = input.nextInt();
		
		System.out.print("n2: ");
		int n2 = input.nextInt();
		
		int k = n1;
		while(n1 % k != 0 || n2 % k != 0) 
			k--;
		System.out.println("Ebob: " + k);
		
		int i = 1;
		while(i % n1 != 0 || i % n2 != 0)
			i++;
		System.out.println("Ekok: " + i);
		System.out.println("Ekok (diger yontem): " + (n1*n2)/k);
		
	}

}
