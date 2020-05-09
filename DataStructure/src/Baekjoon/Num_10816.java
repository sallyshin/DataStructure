package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10816 {
모르게따
//https://www.acmicpc.net/problem/10816
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arrN = new int[n]; // 10
		for(int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arrM = new int[m]; // 8
		for(int i = 0; i < m; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}

		int[] result = new int[m];
		
		for(int i = 0; i < n; i++) {
			int min = 0;
			int max = n;
			int mid;
			int count = 0;
			
			while(min < max) {
				mid = (min + max) / 2;
				
				if(arrN[i] <= arrN[mid]) {
					max = mid;
				}
				else {
					min = mid + 1;
				}
			}
		}

		for(int i = 0; i < m; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
