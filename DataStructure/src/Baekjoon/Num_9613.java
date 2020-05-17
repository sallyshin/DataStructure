package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_9613 {
	// GCD 합
	public static int gcd(int a, int b) {
		int n;
		if(a < b) {
			int temp;
			temp = b;
			b = a;
			a = temp;
		}
		while(b != 0) {
			n = a % b;
			a = b;
			b = n;
		}

		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 3
		for(int i = 0; i < n; i++) { // 3
			StringTokenizer st = new StringTokenizer(br.readLine()); // 3 10 20 30
			int k = Integer.parseInt(st.nextToken()); // k = 3
			int []arr = new int[k];

			for(int j = 0; j < k; j++) { // 3
				arr[j] = Integer.parseInt(st.nextToken()); // 10 20 30
			}
			long ans = 0;
			for(int j = 0; j < k-1; j++) {
				for(int p = j+1; p < k; p++) {
					ans += gcd(arr[p],arr[j]);
				}
			}
			System.out.println(ans);

		}
	}

}
