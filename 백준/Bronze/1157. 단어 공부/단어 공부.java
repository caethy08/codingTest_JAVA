import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//문자열을 대문자로 변환해 입력받음
		String str = br.readLine().toUpperCase();
		
		br.close();
		//입력받은 문자열의 갯수 세고 배열로 담기
		int[] count = new int[26];
		
			for (int j = 0; j < str.length(); j++) {
				int num = str.charAt(j) -'A' ;
	            count[num]++;
				}

		//가장 많이 사용한 문자열 출력, 또는 여러개일 경우 ? 출력 (조건문)(max)
		int max = 0;
		char answer = '?';
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = (char)(i + 'A');
			} else if (max == count[i]) {	
				answer = '?';
			} 
		}
		bw.write(Character.toString(answer));
		bw.flush();
		bw.close();
	}
}