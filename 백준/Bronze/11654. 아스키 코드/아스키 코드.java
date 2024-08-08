import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//문자열 char형식으로 입력받기
		char N = br.readLine().charAt(0);
		
		br.close();

		//char형식의 문자를 int로 변환
		int n = N;
		
		//출력
		bw.write(String.valueOf(n));
				
		bw.flush();
		bw.close();
	}
}