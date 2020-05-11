package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1934 {
	//최소공배수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < n; j++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long min = Math.min(a, b);

		long result = 0;
		for(long i = 1; i <= min; i++) { // 최대공약수 구하기
			if(a % i == 0 && b % i == 0) {
				result = i;
			}
		}
		long k = a * b / result; // 최소공배수 = 수1/최대공약수 * 수2/최대공약수 * 최대공약수;
		bw.write(k + "\n");
		bw.flush();
		}
		br.close();
		bw.close();
	}

}
