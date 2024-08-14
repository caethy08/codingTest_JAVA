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
		//문자열을 입력받는다 이때 앞뒤의 공백을 제거하기 위해 trim()를 사용
		String line = br.readLine().trim();
		
		//배열에 공백을 기준으로 문자열을 분리해 담는다 
		String[] arr = line.split(" ");
		
		//배열의 길이를 출력한다. 그러나 공백만 입력시 0이 출력되야 하므로 조건을 단다
		if(line.isEmpty()) {
			bw.write("0");
		}else {
			bw.write(String.valueOf(arr.length));
		}
		
	
		br.close();		
		bw.flush();
		bw.close();
	}
}