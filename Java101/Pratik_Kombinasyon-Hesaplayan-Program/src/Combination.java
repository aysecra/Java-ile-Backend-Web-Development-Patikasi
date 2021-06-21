import java.util.Scanner;

public class Combination {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n, r;
		System.out.print("C(n,r) için n: ");
		n = input.nextInt();
		System.out.print("r: ");
		r = input.nextInt();
		
		System.out.println("Sonuç: " + fact(n)/(fact(r)*fact(n-r)));

	}

	static int fact(int n) {
		
		//if(n == 1 || n == 0)
		//	return 1;
		//return n*fact(n-1);
		//recursive cozum
		
		int result = 1;
		for(int i = 1; i <= n; i++)
			result *= i;
		return result;
		// iterative cozum
	}
}
