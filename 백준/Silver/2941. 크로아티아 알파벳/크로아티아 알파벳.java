import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	//크로아티아 알파벳이 담긴 배열 선언
	String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	//문자열 입력받기
	String str = br.readLine();
	br.close();
	
	//입력받은 문자열에서 배열의 문자가 있는지 검색 후 있다면 "A"로 치환해 값을 str에 다시 저장ㄴ
	int count=0;

	for (String string : arr) {
		while (str.contains(string)) {
			str = str.replace(string, "A");
		}
	}
	count += str.length();
	//길이를 출력
	bw.write(String.valueOf(count));
	bw.flush();
	bw.close();
	}
}