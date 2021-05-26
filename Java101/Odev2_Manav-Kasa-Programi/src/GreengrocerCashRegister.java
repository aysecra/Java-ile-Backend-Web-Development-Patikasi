import java.util.Scanner;

public class GreengrocerCashRegister {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
		double total = 0;
		int kg;
		
		System.out.print("Armut Kaç Kilo ? :");
		kg = input.nextInt();
		total += kg * armut;
		
		System.out.print("Elma Kaç Kilo ? :");
		kg = input.nextInt();
		total += kg * elma;
		
		System.out.print("Domates Kaç Kilo ? :");
		kg = input.nextInt();
		total += kg * domates;
		
		System.out.print("Muz Kaç Kilo ? :");
		kg = input.nextInt();
		total += kg * muz;
		
		System.out.print("Patlýcan Kaç Kilo ? :");
		kg = input.nextInt();
		total += kg * patlican;
		
		System.out.println("Toplam Tutar : " + total);

	}

}
