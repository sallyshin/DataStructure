package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Num_1914 {
	// 하노이탑
	public static void hanoi(int n, int start, int mid, int end) {
		if(n == 1) {
			System.out.println(start + " " + end);
			return; 
		}
		hanoi(n-1, start, end, mid);
		System.out.println(start + " " + end);
		hanoi(n-1, mid, start, end);
		return;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger bi = new BigInteger("2"); // BigInteger은 무한대까지 표현가능
		BigInteger count = bi.pow(n).subtract(BigInteger.ONE);
		
		System.out.println(count);
		if(n <= 20) {
			hanoi(n, 1, 2, 3);
		}
		
		
	}

}
