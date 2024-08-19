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
		//문자열을 입력받는다
		String word = br.readLine();
		
		int time = 0;
		int length = word.length();
		
		for (int i = 0; i < length; i++) {
			switch (word.charAt(i)) {
				case 'A': case 'B': case 'C':
					time+=3;				
					break;
				case 'D': case 'E': case 'F':
					time+=4;				
					break;
				case 'G': case 'H': case 'I':
					time+=5;				
					break;
				case 'J': case 'K': case 'L':
					time+=6;				
					break;
				case 'M': case 'N': case 'O':
					time+=7;				
					break;
				case 'P': case 'Q': case 'R': case 'S':
					time+=8;				
					break;
				case 'T': case 'U': case 'V':
					time+=9;				
					break;
				case 'X': case 'W': case 'Y': case 'Z':
					time+=10;				
					break;
			
			}
		}
		
		//time값 출력
		bw.write(String.valueOf(time));
		
	
		br.close();		
		bw.flush();
		bw.close();
	}
}