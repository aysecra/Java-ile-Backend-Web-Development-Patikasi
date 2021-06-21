import java.util.Scanner;

public class Fibonacci {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Sayý: ");
		int n = input.nextInt();
		System.out.println(n + ". eleman: " + fibo(n));

	}
	
	static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

}
