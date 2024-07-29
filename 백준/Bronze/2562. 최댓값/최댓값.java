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

        
        //배열 초기화 및 최댓값 변수 초기화
        int[] arr = new int[9];
        int max = arr[0];
        int count = 0;
        //배열 넣기
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            //최대값과 순번
            if (arr[i] > max) {
        		max = arr[i];
        		count = i + 1;
        	}
			
		}
       
        bw.write(String.valueOf(max) + "\n" + String.valueOf(count));
        
        br.close();
        bw.flush();
        bw.close();
    }
}