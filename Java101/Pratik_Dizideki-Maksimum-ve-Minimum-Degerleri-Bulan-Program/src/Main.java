import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] list = {15,12,788,1,-1,-778,2,0};
		
		System.out.print("Dizi : {");
		for (int i = 0; i<list.length-1; i++) {
			System.out.print(list[i] + ",");
		}
		System.out.print(list[list.length-1] + "} \n");
		
		System.out.print("Girilen Sayý : ");
		int n = input.nextInt();
	      
        int maxDiff = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int min = 0, max = 0;
        

        for (int i : list) {
            if (i < n) {
                if(maxDiff > (n - i)) {
                	min = i;
                	maxDiff = n - i;
                }
            }
            if (i > n) {
            	if(minDiff > (i - n)) {
            		max = i;
            		minDiff = i - n;
            	}
            }
        }
        

        System.out.println("Girilen sayýdan küçük en yakýn sayý : " + min);
        System.out.println("Girilen sayýdan büyük en yakýn sayý : " + max);

	}

}
