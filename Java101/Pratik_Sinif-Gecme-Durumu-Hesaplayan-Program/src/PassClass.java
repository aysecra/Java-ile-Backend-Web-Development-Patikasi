import java.util.Scanner;

public class PassClass {

	static Scanner input = new Scanner(System.in);
	static int amount = 0;
	static String lessons = "";
	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		double avarage;
		
		System.out.print("Matematik notunuz : ");
		mat = input.nextInt();
		mat = controlPoint(mat, "Matematik ");
		
		System.out.print("Fizik notunuz : ");
		fizik = input.nextInt();
		fizik = controlPoint(fizik, "Fizik ");
		
		System.out.print("T�rk�e notunuz : ");
		turkce = input.nextInt();
		turkce = controlPoint(turkce , "T�rk�e ");
		
		System.out.print("Kimya notunuz : ");
		kimya = input.nextInt();
		kimya = controlPoint(kimya, "Kimya ");
		
		System.out.print("M�zik notunuz : ");
		muzik = input.nextInt();
		muzik = controlPoint(muzik, "M�zik ");
		
		avarage = (amount > 0) ? (mat + fizik + turkce + kimya + muzik) / amount : 0;
		
		if(avarage <= 55) {
			System.out.println("S�n�fta kald�n�z, seneye tekrar g�r��mek �zere!");
		}
		else {
			System.out.println("Tebrikler, s�n�f� ge�tiniz!");
		}
		System.out.println("Dersler : " + lessons);
		System.out.println("Ortalaman�z : " + avarage);

	}
	
	static int controlPoint(int point, String name) {
		if(point >= 0 && point <=100) {
			amount++;
			lessons += name;
			return point;
		}
		return 0;
	}

}
