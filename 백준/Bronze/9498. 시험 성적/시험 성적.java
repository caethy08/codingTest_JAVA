import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int num = scanner.nextInt();
		
		//조건문
		if (90 <= num) {
			System.out.println("A");
		}else if (80 <= num) {
			System.out.println("B");
		}else if (70 <= num) {
			System.out.println("C");
		}else if (60 <= num) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		scanner.close();

	}

}