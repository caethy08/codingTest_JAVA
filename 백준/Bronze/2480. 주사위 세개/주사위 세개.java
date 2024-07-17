import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int a = scanner.nextInt(); 
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//조건문
		if (a == b) {
			if (b == c) {
				System.out.println(10000 + a * 1000);
			}else {
				System.out.println(1000 + a * 100);
			}
		}else if (a == c) {
			System.out.println(1000 + a * 100);
		}else if (b == c) {
			System.out.println(1000 + b * 100);
		}else {
			System.out.println((a > b)&&(a > c)?(a * 100):(c>b?c * 100:b * 100));
		}		
		scanner.close();
	}
}