import java.util.Scanner;

public class MaxMin {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Kaç tane sayý gireceksiniz: ");
		int n = input.nextInt();
		System.out.print("1. Sayýyý giriniz: ");
		int max = input.nextInt();
		int min = max;
		
		for(int i = 1; i < n; i++) {
			System.out.print((i+1) + ". Sayýyý giriniz: ");
			int current = input.nextInt();
			if(current > max)
				max = current;
			else if(current < min)
				min = current;
		}
		System.out.println("En büyük sayý: " + max);
		System.out.println("En küçük sayý: " + min);

	}

}
