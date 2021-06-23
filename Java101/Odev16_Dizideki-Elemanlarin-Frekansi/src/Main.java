
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		System.out.print("Dizi : [");
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + ", ");
			
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else map.put(arr[i], 1);	
		}
		
		System.out.print(arr[arr.length-1] + "] \n");
		if(map.containsKey(arr[arr.length-1]))
			map.put(arr[arr.length-1], map.get(arr[arr.length-1]) + 1);
		
		System.out.println("Tekrar Sayýlarý");
		
		map.entrySet().forEach(m -> {
		    System.out.println(m.getKey() + " sayýsý " + m.getValue() + " kere tekrar edildi.");
		});

	}

}
