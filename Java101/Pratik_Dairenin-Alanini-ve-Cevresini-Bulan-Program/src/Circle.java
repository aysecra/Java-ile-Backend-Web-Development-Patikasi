import java.util.Scanner;

public class Circle {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int r, alfa;
		double pi = 3.14, alan, cevre, dilimAlani;
		
		System.out.print("Dairenin yar� �ap�n� giriniz : ");
		r = input.nextInt();
		System.out.print("Merkez a��s�n�n �l��s�n� giriniz : ");
		alfa = input.nextInt();
		
		alan = pi * r * r;
		cevre = 2 * pi * r;
		dilimAlani = (alan * alfa) / 360;
		
		System.out.println("Dairenin toplam alan� : " + alan);
		System.out.println("Dairenin �evresi : " + cevre);
		System.out.println("Daire diliminin alan� : " + dilimAlani);

	}

}
