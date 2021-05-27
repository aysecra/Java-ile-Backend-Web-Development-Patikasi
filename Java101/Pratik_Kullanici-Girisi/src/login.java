import java.util.Scanner;

public class login {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String username, password;
		String currentUsername = "patika", currentPassword = "java1230";
		int zeroing;
		
		System.out.print("Kullanýcý Adýnýz : ");
		username = input.nextLine();
		
		System.out.print("Þifreniz : ");
		password = input.nextLine();
		
		if(username.equals(currentUsername) && password.equals(currentPassword))
			System.out.println("Giriþ Yaptýnýz! ");
		
		else if(username.equals(currentUsername) && password.equals(currentPassword) == false) {
			System.out.println("Bilgileriniz yanlýþ! ");
			System.out.print("Þifreyi sýfýrlamak istiyor musunuz? (Hayýr:0, Evet:1) : ");
			zeroing = input.nextInt();
			switch(zeroing) {
			case 1: 
				String current = "";
				System.out.print("Yeni Þifre : ");
				current = input.next();
				if(current.equals(currentPassword))
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				else {
					currentPassword = current;
					System.out.println("Þifre oluþturuldu");
				}
				
				break;
			default: System.out.println("Þifre sýfýrlanmadý.");
			}
			
		}
		else {
			System.out.println("Bilgileriniz yanlýþ! ");
		}

	}

}
