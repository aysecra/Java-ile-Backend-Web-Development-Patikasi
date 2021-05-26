import java.util.Scanner;

public class Circle {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int r, alfa;
		double pi = 3.14, alan, cevre, dilimAlani;
		
		System.out.print("Dairenin yarý çapýný giriniz : ");
		r = input.nextInt();
		System.out.print("Merkez açýsýnýn ölçüsünü giriniz : ");
		alfa = input.nextInt();
		
		alan = pi * r * r;
		cevre = 2 * pi * r;
		dilimAlani = (alan * alfa) / 360;
		
		System.out.println("Dairenin toplam alaný : " + alan);
		System.out.println("Dairenin çevresi : " + cevre);
		System.out.println("Daire diliminin alaný : " + dilimAlani);

	}

}
