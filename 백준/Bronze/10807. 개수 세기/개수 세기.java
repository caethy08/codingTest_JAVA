import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;
        //배열 입력
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //찾는 수 입력
        int v = Integer.parseInt(br.readLine());
        //숫자 찾기
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if(v == arr[j]) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
    }
}