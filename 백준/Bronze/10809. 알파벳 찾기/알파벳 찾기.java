import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//배열을 하나 생성해 모두 -1의 값을 넣어준다(배열의 크기는 알파뱃의 수)
		int[] arr = new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		//단어 S를 입력받는다.
		String S = br.readLine();
		
		//S를 구성하는 각 문자들의 위치 받기(charAt과 반복문 사용)
		for (int i = 0; i < S.length(); i++) {
			char s = S.charAt(i);
			//생성해둔 알파벳 크기의 배열에 위치값 집어넣어서 새로운 배열 만들기 
            //이때 조건문으로 동일 문자가 이미 포함된 경우 처음 나타낸 위치로 지정
			if(arr[s - 'a'] == -1)
			arr[s - 'a'] = i;
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			bw.write(String.valueOf(arr[i] + " "));
		};
		
		br.close();		
		bw.flush();
		bw.close();
	}
}