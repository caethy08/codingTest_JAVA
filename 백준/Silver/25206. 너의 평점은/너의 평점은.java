import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str= new String[20];
		double[] gradeScoreArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		String [] gradeArr =  {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
		
		Double totalSum = 0.0;
		Double sum = 0.0;
		
		//입력받은 단어들을 " "으로 분할 해서 받기
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
			StringTokenizer st = new StringTokenizer(str[i]);
			String subject = st.nextToken();
			Double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			//각 과목의 학점*과목평점의 값을 구한다
			for (int j = 0; j < gradeArr.length; j++) {
				//받은 학점을 점수로 변환해 값을 구한다.
				if (grade.equals(gradeArr[j])) {
					totalSum += credit * gradeScoreArr[j];
					//p점은 계산에서 제외
					if (j != 9) {
						sum += credit;
					}
				}
			}
			
		}
		//학점의 총합으로 학점*과목평점의 값을 나눈값을 구하고 수수점 아래 6자리만 나오게 수정
		Double average = totalSum / sum;
		String answer = String.format("%.6f", average);
		
		bw.write(answer);
		
		br.close();
		bw.flush();
		bw.close();

		 }
}