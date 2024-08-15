import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
//	A와 B를 입력받는다
	String A = st.nextToken();
	String B = st.nextToken();
	
//	각 숫자를 하나씩 문자열로 만들어서 배열로 입력받는다. 이 때 3자리수를 입력받는 다고 하기때문에 배열의 크기는 3으로 고정
	char[] Arr = A.toCharArray();
	char[] Brr = B.toCharArray();
	
//	입력받은 수를 거꾸로 뒤집는다. 
	char[] reverseArr = new char[3];
	char[] reverseBrr = new char[3];
	
	for (int i = 2, j = 0 ; i >= 0; i--, j++) {
		reverseArr[j] = Arr[i];
		reverseBrr[j] = Brr[i];
	}
	
//	뒤집은 문자열을 3자릿수로 되돌린다
	String revA = new String(reverseArr);
	String revB = new String(reverseBrr);
	
	int reva = Integer.parseInt(revA);
	int revb = Integer.parseInt(revB);
	
//	두 수를 비교한다
	int answer = Integer.compare(reva, revb);
	
//	답을 출력한다
	if (answer >= 0) {
		bw.write(String.valueOf(reva));
	}else {
		bw.write(String.valueOf(revb));
	}
	
	
	br.close();
	bw.flush();
	bw.close();
	}
}