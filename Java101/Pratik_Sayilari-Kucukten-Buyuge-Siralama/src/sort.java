import java.util.Scanner;

public class sort {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c;
		
		System.out.print("1. Say� : ");
		a = input.nextInt();
		
		System.out.print("2. Say� : ");
		b = input.nextInt();
		
		System.out.print("3. Say� : ");
		c = input.nextInt();
		
		if(a <= b && a <= c) {
			if(b <= c)
				System.out.println("a < b < c");
			else System.out.println("a < c < b");
		}
		else if(b <= a && b <= c) {
			if(a <= c)
				System.out.println("b < a < c");
			else System.out.println("b < c < b");
		}
		else {
			if(a <= b)
				System.out.println("c < a < b");
			else System.out.println("c < b < a");
		}

	}

}
