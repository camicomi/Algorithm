import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int sum = n*(n+1)/2;
	
	System.out.println(sum);
	}

}