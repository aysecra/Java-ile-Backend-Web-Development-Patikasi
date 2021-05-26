import java.util.Scanner;

public class BMI {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int kg;
		double m, bmi;
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		m = input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kg = input.nextInt();
		
		bmi = kg / (m * m);
		System.out.println("Vücut Kitle Ýndeksiniz : " + bmi);

	}

}
