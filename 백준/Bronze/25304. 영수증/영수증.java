import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int X = scanner.nextInt(); 
		int N = scanner.nextInt();
		
		int price = 0;
		int sum = 0;
		//반복문
		for (int i = 0; i < N; i++) {
			//배열안에 들어갈 금액과 갯수
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			price = a * b; 
			
			sum += price;
		}
		scanner.close();
		
		//총금액 검산
		if (X == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}