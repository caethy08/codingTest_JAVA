import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer token;
       
       int T = Integer.parseInt(reader.readLine());
       
       for (int i = 0; i < T; i++) {
		token = new StringTokenizer(reader.readLine());
			writer.write((Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken())) + "\n");
	}
       writer.close();
        
    }
}