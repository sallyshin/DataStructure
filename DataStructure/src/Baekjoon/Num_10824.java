package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10824 {
	// 네 수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String num1 = st.nextToken() + st.nextToken(); // 10 20
		String num2 = st.nextToken() + st.nextToken(); // 30 40
		long result1 = Long.valueOf(num1);
		long result2 = Long.valueOf(num2);

		long result = result1 + result2;
		System.out.println(result);
		br.close();
	}

}
