import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//입력
		String S = br.readLine();
		
		br.close();
		
		//출력
		System.out.println(S.length());
		
	}
}