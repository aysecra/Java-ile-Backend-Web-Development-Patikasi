import java.util.Scanner;

public class BMI {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int kg;
		double m, bmi;
		
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		m = input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz : ");
		kg = input.nextInt();
		
		bmi = kg / (m * m);
		System.out.println("V�cut Kitle �ndeksiniz : " + bmi);

	}

}
