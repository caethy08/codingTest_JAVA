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
		
		//반복문을 사용해 입력값을 받는다
		int T = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			//문자열을 나눈다
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < S.length(); j++) {
				char c = S.charAt(j);
				//각 문자를 반복하여 결과에 추가한다.
				for (int k = 0; k < R; k++) {
					sb.append(c);
				}
			}
			//출력
			bw.write(String.valueOf(sb));
			bw.newLine();	
		}
	
		br.close();		
		bw.flush();
		bw.close();
	}
}