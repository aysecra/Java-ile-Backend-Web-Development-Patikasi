import java.util.Scanner;

public class calculator {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n1, n2, select;
		
		System.out.print("�lk Say�y� Giriniz : ");
		n1 = input.nextInt();
		System.out.print("�kinci Say�y� Giriniz : ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("Se�iniz: ");
		select = input.nextInt();
		
		switch(select) {
			case 1: System.out.println("Toplam : " + (n1 + n2)); break;
			case 2: System.out.println("��karma : " + (n1 - n2)); break;
			case 3: System.out.println("�arpma : " + (n1 * n2)); break;
			case 4: 
				switch(n2) {
				 case 0: System.out.println("Bir say� 0'a b�l�nemez!"); break;
				 default: System.out.println("B�lme : " + (n1 / n2)); break;
				}break;
			default: System.out.println("Yanl�� se�im yapt�n�z. Tekrar deneyiniz.");
		}	

	}

}
