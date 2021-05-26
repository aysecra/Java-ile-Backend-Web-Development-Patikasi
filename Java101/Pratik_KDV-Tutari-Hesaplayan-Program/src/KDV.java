import java.util.Scanner;

public class KDV {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double tutar, kdvOran, kdvTutar, kdvliTutar;
		
		do {
			System.out.print("Ücret Tutarýný Giriniz: ");
			tutar = input.nextDouble();
		}while(tutar < 0);
		
		kdvOran = (tutar > 10000) ? 0.08 : 0.18;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Tutar : " + tutar);
		System.out.println("KDV Oraný : " + kdvOran);
		System.out.println("KDV Tutarý : " + kdvTutar);
		System.out.println("KDV'li Tutar : " + kdvliTutar);
		
	}

}
