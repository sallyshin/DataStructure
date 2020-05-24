package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Num_1914 {
	// 하노이탑
	public static void hanoi(int n, int a, int b, int c) {
		if(n == 1) {
			System.out.println(a + " " + b);
			return; 
		}
		hanoi(n-1, a, b, c);
		System.out.println(a + " " + c);
		hanoi(n-1, b, a, c);
		return;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger bi = new BigInteger("2"); // BigInteger은 무한대까지 표현가능
		BigInteger count = bi.pow(n).subtract(BigInteger.ONE);
		
		System.out.println(count);
		if(n <= 20) hanoi(n, 1, 2, 3);
		
		
	}

}
