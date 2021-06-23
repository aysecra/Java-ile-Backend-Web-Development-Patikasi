import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Dizinin boyutu n : ");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Dizinin elemanlarýný giriniz :");
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + ". Elemaný : ");
			arr[i] = input.nextInt();
		}
		QuickSort(arr, 0, arr.length-1);
		
		System.out.print("Sýralama : ");
		for(int a : arr)
			System.out.print(a + " ");
	}
	
	static void QuickSort(int[] A, int b, int s)
    {
        if (b < s)
        {
            int r = Partition(A, b, s);
            QuickSort(A, b, r - 1);
            QuickSort(A, r + 1, s);
        }
    }
	
    static int Partition(int[] A, int b, int s)
    {
        int pivot = A[s];
        int i = b - 1;
        for (int j = b; j < s; j++)
        {
            if (A[j] <= pivot)
            {
                i++;
                int current = A[i];
                A[i] = A[j];
                A[j] = current;
            }
        }
        int current1 = A[i + 1];
        A[i + 1] = A[s];
        A[s] = current1;
        return i + 1;
    }

}
