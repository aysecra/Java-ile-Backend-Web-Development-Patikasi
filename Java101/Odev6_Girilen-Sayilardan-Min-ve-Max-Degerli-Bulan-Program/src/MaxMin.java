import java.util.Scanner;

public class MaxMin {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Ka� tane say� gireceksiniz: ");
		int n = input.nextInt();
		System.out.print("1. Say�y� giriniz: ");
		int max = input.nextInt();
		int min = max;
		
		for(int i = 1; i < n; i++) {
			System.out.print((i+1) + ". Say�y� giriniz: ");
			int current = input.nextInt();
			if(current > max)
				max = current;
			else if(current < min)
				min = current;
		}
		System.out.println("En b�y�k say�: " + max);
		System.out.println("En k���k say�: " + min);

	}

}
