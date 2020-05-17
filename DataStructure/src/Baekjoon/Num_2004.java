package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2004 {
	// 조합 0의 개수
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static long fiveCount(long n) {
		long five = 0;
		long i;
		// 신기한 알고리즘, n안에 i가 몇개 있는지 세려면 i제곱씩 나눠주면 됨
		for(i = 5; i <= n; i*=5) {
			five += n / i;
		}
		return five;
	}
	// 범위가 int형을 넘어가기때문에 long형으로 변수 선언
	public static long twoCount(long n) {
		long two = 0;
		long i;
		for(i = 2; i <= n; i*=2) {
			two += n / i;
		}
		return two;
	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long five = fiveCount(n);
		long two = twoCount(n);
		
		five -= fiveCount(m);
		two -= twoCount(m);
		
		five -= fiveCount(n-m);
		two -= twoCount(n-m);
		
		System.out.println(Math.min(five, two));
		br.close();

	}

}
