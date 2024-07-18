import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int T = scanner.nextInt(); 
		int arr[] = new int[T];
		//반복문
		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			arr[i] = A + B;
		}
		scanner.close();
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}