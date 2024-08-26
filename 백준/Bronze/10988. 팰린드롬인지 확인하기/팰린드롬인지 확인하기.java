import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//문자열을 입력
		String str = br.readLine();
		br.close();
		//문자열을 뒤집은 reverse문자열 생성(reverse()사용)
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		
		//삼항연산문을 이용해 각 배열을 비교하고 같으면 1, 아니면 0을 출력한다.
		bw.write(str.equals(reverse)? "1":"0");
		
		
		bw.flush();
		bw.close();
	}
}
