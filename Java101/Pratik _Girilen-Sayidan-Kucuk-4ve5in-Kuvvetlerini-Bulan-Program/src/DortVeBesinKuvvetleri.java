import java.util.Scanner;

public class DortVeBesinKuvvetleri {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Sayý: ");
		int n = input.nextInt();
		System.out.print("Dörtün Kuvvetleri: ");
		for(int i = 1; i < n; i*=4) {
			System.out.print(i + " ");
		}
		System.out.print("\nBeþin Kuvvetleri: ");
		for(int i = 1; i < n; i*=5) {
			System.out.print(i + " ");
		}
		
	}

}
