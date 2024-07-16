import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int y = scanner.nextInt();
		
		//조건문
		if (y % 4 == 0 && y % 100 != 0) {
			System.out.println("1");
		}else if (y % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		scanner.close();

	}

}