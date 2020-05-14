package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1850 {
	// 최대공약수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		long min = Math.min(a, b);

		for(long i = 1; i <= min; i++) { // 최대공약수
			if(a % i == 0 && b % i == 0) {
				result = i;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < result; i++) {
			sb.append('1');
		}
		bw.write(sb.toString() + "");
		br.close();
		bw.flush();
		bw.close();
	}

}
