import java.util.Scanner;

public class Temperature {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int temp;
		String message = "";
		
		System.out.print("Sýcaklýk Giriniz : ");
		temp = input.nextInt();
		
		if(temp > 25) message += "Yüzmeye gidebilirsiniz. \n";
		else if(temp >= 10) message += "Pikniðe gidebilirsiniz. \n";
		if(temp >= 5 && temp <= 15) message += "Sinemaya gidebilirsin. \n";
		else if(temp < 5) message += "Kayak yapabilirsiniz. \n";
		
		System.out.println(message);

	}

}
