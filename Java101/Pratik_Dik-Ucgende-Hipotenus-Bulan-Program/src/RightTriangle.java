import java.util.Scanner;

public class RightTriangle {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b;
		double c, u, Alan;
		
		System.out.print("1. Kenar� Giriniz : ");
		a = input.nextInt();
		
		System.out.print("2. Kenar� Giriniz : ");
		b = input.nextInt();
		
		c = Math.sqrt((a * a) + (b * b));
		u = (a + b + c) / 2;
		Alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		
		System.out.println("Hipoten�s : " + c);
		System.out.println("u : " + u);
		System.out.println("Alan : " + Alan);

	}

}
