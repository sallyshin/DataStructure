// 피보나치 함수
// https://www.acmicpc.net/problem/1003
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_1003 {

	static int[][] dp = new int[41][2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int arr[] = new int[t];
		/* n = 0 */
		dp[0][0] = 1;
		dp[0][1] = 0;
		/* n = 1 */
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 2; i < 41; i++) {
			for(int j = 0; j < 2; j++) {
				dp[i][j] = dp[i-1][j] + dp[i-2][j];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			sb.append(dp[arr[i]][0] + " " + dp[arr[i]][1]).append("\n");
		}
		System.out.println(sb.toString());
		
	}

}
