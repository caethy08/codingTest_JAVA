import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//입력받은 숫자만큼 반복문을 돌려서 입력받은 문자를 검사
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (isGroupWord() == true) {
                count++;
            }
		}
		
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}
		
		//그룹 단어인지 확인하는 메소드 생성
		 public static boolean isGroupWord() throws IOException {
		        boolean[] seen = new boolean[26]; // 알파벳 등장 여부를 저장하는 배열
		        int prev = 0; // 이전 문자
		        String str = br.readLine();
		        
		        for (int i = 0; i < str.length(); i++) {
		            int curr = str.charAt(i); // 현재 문자

		            if (curr != prev) {
		                if (seen[curr - 'a'] == false) {
		                	seen[curr - 'a'] = true;
		                	prev = curr; 
		                	
		                }else {
		                	return false; 
						}  
		            }
		            else {
						continue;
					}
		        }

		        return true; // 반복 없이 끝까지 갔다면 그룹 단어
		 }
}