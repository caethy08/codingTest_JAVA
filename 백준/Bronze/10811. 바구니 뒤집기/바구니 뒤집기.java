import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        for(int a = 0; a < N; a++){
        	arr[a] = a+1;
        }
    
        //변경
    	for (int b = 0; b < M; b++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int i = Integer.parseInt(st.nextToken())-1;
    		int j = Integer.parseInt(st.nextToken())-1;
    		
    		while (i < j) {
				int imsi = arr[i];
				arr[i] = arr[j];
				arr[j] = imsi;
				i++;
				j--;
			}

		}
    		
    	//출력
    		for (int num : arr) {
    			bw.write(String.valueOf(num) + " ");
    		}
    		
    		br.close();
    		bw.flush();
    		bw.close();	
		}
		
}