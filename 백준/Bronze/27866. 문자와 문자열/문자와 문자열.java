import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		int i = scanner.nextInt();
		
		String answer = S.substring(i-1, i);
		
		System.out.println(answer);
	}
}