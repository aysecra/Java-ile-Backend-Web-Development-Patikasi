import java.util.Scanner;

public class horoscope {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int month, day;
		
		System.out.print("Do�du�unuz ay : ");
		month = input.nextInt();
		
		System.out.print("Do�du�unuz g�n : ");
		day = input.nextInt();
		
		if((month == 1 && day >= 22) || (month == 2 && day <= 19))
			System.out.println("Kova Burcu");
		else if((month == 2 && day >= 20) || (month == 3 && day <= 20))
			System.out.println("Bal�k Burcu");
		else if((month == 3 && day >= 21) || (month == 4 && day <= 20))
			System.out.println("Ko� Burcu");
		else if((month == 4 && day >= 21) || (month == 5 && day <= 21))
			System.out.println("Bo�a Burcu");
		else if((month == 5 && day >= 22) || (month == 6 && day <= 22))
			System.out.println("�kizler Burcu");
		else if((month == 6 && day >= 23) || (month == 7 && day <= 22))
			System.out.println("Yenge� Burcu");
		else if((month == 7 && day >= 23) || (month == 8 && day <= 22))
			System.out.println("Aslan Burcu");
		else if((month == 8 && day >= 23) || (month == 9 && day <= 22))
			System.out.println("Ba�ak Burcu");
		else if((month == 9 && day >= 23) || (month == 10 && day <= 22))
			System.out.println("Terazi Burcu");
		else if((month == 10 && day >= 23) || (month == 11 && day <= 21))
			System.out.println("Akrep Burcu");
		else if((month == 11 && day >= 22) || (month == 12 && day <= 21))
			System.out.println("Yay Burcu");
		else if((month == 12 && day >= 22) || (month == 1 && day <= 21))
			System.out.println("O�lak Burcu");
		else System.out.println("Hatal� bir tarih girdiniz.");

	}

}
