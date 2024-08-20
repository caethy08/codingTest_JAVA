import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//반복문으로 다음 라인이 빌떄까지 입력값을 받아 출력한다.
		String str;
		
		while ((str = br.readLine()) != null) {
			bw.write(str + "\n");
		}
		
		br.close();		
		bw.flush();
		bw.close();
	}
}