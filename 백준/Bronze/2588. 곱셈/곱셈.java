import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int a, b, c;
		a = B/100;
		B %= 100;
		
		b = B/10;
		B %= 10;
		
		c = B;
		
		System.out.println(A * c);
		System.out.println(A * b);
		System.out.println(A * a);
		
		B = (a*100) + (b*10) + c;
		System.out.println(A * B);
		
		scanner.close();
	}
}