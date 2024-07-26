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

        int N = Integer.parseInt(br.readLine());
        
        //배열 선언및 초기화
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        //배열 넣기
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //배열을 정렬하기
        Arrays.sort(arr);
        
        //출력
        bw.write(String.valueOf(arr[0]) + " " + String.valueOf(arr[N - 1]));
        
        br.close();
        bw.flush();
        bw.close();
    }
}