import java.util.Scanner;

public class AirTicket {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int km, age, type;
		double total;
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		km = input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz : ");
		age = input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ): ");
		type = input.nextInt();
		
		if(km >= 0 && age >= 0 && (type == 1 || type == 2)) {
			total = km * 0.10;
			if(age < 12) {
				total -= total * 0.5;
			}
			else if(age < 24) {
				total -= total * 0.1;
			}
			else if(age > 65) {
				total -= total * 0.3;
			}
			
			switch(type) {
			case 1: System.out.println("Toplam Tutar = " + total); break;
			default : 
				total -= total * 0.2;
				System.out.println("Toplam Tutar = " + (total * type)); 
			break;
			}
		}
		else System.out.println("Hatalý Veri Girdiniz !");


	}

}
