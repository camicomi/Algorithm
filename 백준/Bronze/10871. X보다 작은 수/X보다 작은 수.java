import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); 
		int x = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<n; i++) {
			
			int v = scan.nextInt();
			if (v < x) {
				sb.append(v+" ");
			}
		}
		
		System.out.println(sb);
	}

}
