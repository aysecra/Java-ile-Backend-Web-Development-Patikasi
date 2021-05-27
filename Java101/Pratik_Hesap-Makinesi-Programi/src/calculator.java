import java.util.Scanner;

public class calculator {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n1, n2, select;
		
		System.out.print("Ýlk Sayýyý Giriniz : ");
		n1 = input.nextInt();
		System.out.print("Ýkinci Sayýyý Giriniz : ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiniz: ");
		select = input.nextInt();
		
		switch(select) {
			case 1: System.out.println("Toplam : " + (n1 + n2)); break;
			case 2: System.out.println("Çýkarma : " + (n1 - n2)); break;
			case 3: System.out.println("Çarpma : " + (n1 * n2)); break;
			case 4: 
				switch(n2) {
				 case 0: System.out.println("Bir sayý 0'a bölünemez!"); break;
				 default: System.out.println("Bölme : " + (n1 / n2)); break;
				}break;
			default: System.out.println("Yanlýþ seçim yaptýnýz. Tekrar deneyiniz.");
		}	

	}

}
