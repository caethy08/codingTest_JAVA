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
		StringTokenizer st = new StringTokenizer(br.readLine());
		//반복 횟수 입력
		int T = Integer.parseInt(st.nextToken());
		
		//문자열 입력받고 추출
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			//첫 글자와 끝 글자 추출
			String first = a.substring(0, 1);
			String end = a.substring(a.length()-1, a.length());
			//출력
			bw.write(first + end + "\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}