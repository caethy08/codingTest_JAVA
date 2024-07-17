import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		//조건문
		if (M>=45) {
			System.out.println(H + " " + (M - 45));
		}else if (H > 0 && M < 45) {
			System.out.println((H - 1) + " " + (M + 60 - 45));
		}else {
			System.out.println((24 - 1) + " " + (M + 60 - 45));
		}		
		scanner.close();
	}
}