import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//숫자의 개수 입력받기
		int N = Integer.parseInt(br.readLine());
		
		//공백없는 숫자열 입력받기
		String str = br.readLine();
		
		//숫자열 한개씩 분리해 배열에 입력받기(split()사용)
		String[] strArr = str.split("");
		
		//주어진 숫자의 합 구하기(문자열 -> 숫자열)
		int answer = 0;
		for (int i = 0; i < N; i++) {
			answer += Integer.parseInt((strArr[i]));
		}
		
		//출력
		bw.write(String.valueOf(answer));
				
		bw.flush();
		bw.close();
	}
}