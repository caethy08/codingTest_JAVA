import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//배열의 입력
		int[] origin = new int[] {1,1,2,2,2,8};
		int[] my = new int [6];
		
		for (int i = 0; i < my.length; i++) {
			my[i] =  Integer.parseInt(st.nextToken());
		}
		br.close();		
		
		//배열의 각 값의 자리 비교 후 연산
		int[] answer = new int[6]; 
		for (int i = 0; i < my.length; i++) {
			answer[i] = origin[i] - my[i];
			
			bw.write(String.valueOf(answer[i] + " "));
		}
		
		bw.flush();
		bw.close();
	}
}