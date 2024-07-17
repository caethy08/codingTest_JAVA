import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int A = scanner.nextInt(); 
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		//조건문
		if ((B + C)/60 < 1) {
			System.out.println(A + " " + (B + C));
		}else if (A+(B+C)/60 < 24) {
			System.out.println(A+(B+C)/60 + " " + (B + C)%60);
		}else {
			System.out.println(A+(B+C)/60-24 + " " + (B + C)%60);
		}		
		scanner.close();
	}
}