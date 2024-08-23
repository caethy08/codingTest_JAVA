import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
