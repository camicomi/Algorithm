import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}


		outerloop:
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				sum = 0;
				for (int k = 0; k < 9; k++) {
					if (k != i && k != j) { 
						sum += arr[k];
					}
				}
				if (sum == 100) {
					int[] result = new int[7];
					int index = 0;
					for (int k = 0; k<9; k++) {
						if (k != i && k !=j) {
							result[index++] = arr[k];
						}
					}
					Arrays.sort(result);
					for (int k = 0; k<7; k++) {
						System.out.println(result[k]);
						}
					break outerloop;
					}
				}
			}
		}
    }