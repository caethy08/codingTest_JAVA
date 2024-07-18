import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int N = scanner.nextInt();
		
		scanner.close();
		
		String str = "";
		int k = N/4;
		//반복문
		for (int i = 0; i < k ; i++) {
			str += "long ";
		}
		System.out.println(str + "int");
	}
}