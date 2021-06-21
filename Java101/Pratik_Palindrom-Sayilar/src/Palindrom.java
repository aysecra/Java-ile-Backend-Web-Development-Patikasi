import java.util.Scanner;

public class Palindrom {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int number;
		while(true) {
			System.out.print("Number: ");
			number = input.nextInt();
			System.out.println(isPalindrom(number));
		}
		
	}
	
	static boolean isPalindrom(int number) {
		int temp = 	number, reverseNumber = 0, mod;
		
		while(temp != 0) {
			mod = temp % 10;
			reverseNumber = (reverseNumber * 10) + mod;
			temp /= 10;
		}
		return number == reverseNumber;
	}

}
