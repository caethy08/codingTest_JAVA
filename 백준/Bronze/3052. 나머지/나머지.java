import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[10];
		// 배열 넣기
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		//배열의 중복 제거
		arr= Arrays.stream(arr).distinct().toArray();
		
		//출력
		bw.write(String.valueOf(arr.length));
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}