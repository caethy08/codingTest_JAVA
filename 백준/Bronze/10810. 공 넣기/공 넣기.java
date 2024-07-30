import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 변수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        
        //배열 초기화
        int[] arr = new int[N];
        
        //배열 넣기
        for(int a = 0; a < M; a++){
        	st = new StringTokenizer(br.readLine());
        	int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
			for (int b = i-1; b < j ; b++) {
				arr[b] = k;
			}
		}
        
        //출력
        for (int i = 0; i < arr.length; i++) {
        	bw.write(arr[i] + " ");
			
		}
        
        br.close();
        bw.flush();
        bw.close();
    }
}