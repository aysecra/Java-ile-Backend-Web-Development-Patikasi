import java.util.Scanner;

public class login {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String username, password;
		String currentUsername = "patika", currentPassword = "java1230";
		int zeroing;
		
		System.out.print("Kullan�c� Ad�n�z : ");
		username = input.nextLine();
		
		System.out.print("�ifreniz : ");
		password = input.nextLine();
		
		if(username.equals(currentUsername) && password.equals(currentPassword))
			System.out.println("Giri� Yapt�n�z! ");
		
		else if(username.equals(currentUsername) && password.equals(currentPassword) == false) {
			System.out.println("Bilgileriniz yanl��! ");
			System.out.print("�ifreyi s�f�rlamak istiyor musunuz? (Hay�r:0, Evet:1) : ");
			zeroing = input.nextInt();
			switch(zeroing) {
			case 1: 
				String current = "";
				System.out.print("Yeni �ifre : ");
				current = input.next();
				if(current.equals(currentPassword))
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				else {
					currentPassword = current;
					System.out.println("�ifre olu�turuldu");
				}
				
				break;
			default: System.out.println("�ifre s�f�rlanmad�.");
			}
			
		}
		else {
			System.out.println("Bilgileriniz yanl��! ");
		}

	}

}
