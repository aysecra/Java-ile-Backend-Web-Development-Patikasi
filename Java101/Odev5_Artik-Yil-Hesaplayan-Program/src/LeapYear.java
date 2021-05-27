import java.util.Scanner;

public class LeapYear {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int year;
		
		System.out.print("Yıl Giriniz : ");
		year = input.nextInt();
		
		if(year % 400 == 0) 
			System.out.println(year + " bir artık yıldır !");
		else if(year % 100 == 0) 
			System.out.println(year + " bir artık yıldır değildir !");
		else if(year % 4 == 0) 
			System.out.println(year + " bir artık yıldır !");
		else System.out.println(year + " bir artık yıldır değildir !");
		
	}

}
