import java.util.Scanner;

public class GradeAverage {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, tarih, muzik;
		double ort;
		String message = "";
		
		System.out.print("Matematik Notunuz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = input.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = input.nextInt();
		
		System.out.print("T�rk�e Notunuz: ");
		turkce = input.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = input.nextInt();
		
		System.out.print("M�zik Notunuz: ");
		muzik = input.nextInt();
		
		ort = calcAverage(mat, fizik, kimya, turkce, tarih, muzik);
		
		message = (ort > 60) ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
		System.out.println(message);

	}
	
	static double calcAverage(int mat, int fizik, int kimya, int turkce, int tarih, int muzik) {
		return (mat + fizik + kimya + turkce + tarih + muzik)/6.0;
	}

}
