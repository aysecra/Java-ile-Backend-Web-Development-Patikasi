import java.util.Scanner;

public class LeapYear {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int year;
		
		System.out.print("Y�l Giriniz : ");
		year = input.nextInt();
		
		if(year % 400 == 0) 
			System.out.println(year + " bir art�k y�ld�r !");
		else if(year % 100 == 0) 
			System.out.println(year + " bir art�k y�ld�r de�ildir !");
		else if(year % 4 == 0) 
			System.out.println(year + " bir art�k y�ld�r !");
		else System.out.println(year + " bir art�k y�ld�r de�ildir !");
		
	}

}
