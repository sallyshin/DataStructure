package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1850 {
	// 최대공약수
	public static long gcd(long a, long b) { // 유클리드 호제법
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		long min = Math.min(a, b);
		long max = Math.max(a, b);

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < gcd(min, max); i++) {
			sb.append('1'); // 유클리드호제법이 끝날때까지 1이 붙는다
		}
		bw.write(sb.toString() + "");
		br.close();
		bw.flush();
		bw.close();
	}

}
