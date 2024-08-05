import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//입력
		String S = br.readLine();
		
		int i = Integer.parseInt(br.readLine())-1; //배열이 0부터 시작되기 때문
		
		String answer = S.substring(i, i+1);
		
		//출력
		bw.write(answer);
		
		br.close();
		bw.flush();
		bw.close();
	}
}