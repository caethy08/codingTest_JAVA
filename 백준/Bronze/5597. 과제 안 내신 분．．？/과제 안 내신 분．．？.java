import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        //배열 초기화
        boolean[] arr = new boolean[31];
        
        //배열 넣기
        for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine())] = true;
			
		}
        
        //배열 비교 및 출력(번호가 1번부터 시작하기 때문에 1부터 시작)
        for (int i = 1; i <= 30; i++) {
			if (!arr[i]) {
				bw.write(i + "\n");
			}
		}
        
        br.close();
        bw.flush();
        bw.close();
    }
}