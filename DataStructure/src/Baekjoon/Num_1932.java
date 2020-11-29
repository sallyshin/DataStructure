// 정수 삼각형
//https://www.acmicpc.net/problem/1932

package Baekjoon;

import java.io.*;
import java.util.*;

public class Num_1932 {
	
	static Integer dp[][];
	static int arr[][];
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n][n];
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			dp[n-1][i] = arr[n-1][i];
		}
		
		System.out.println(dp(0, 0));
		
	}
	public static int dp(int depth, int index) {
		
		if(n == depth-1) return dp[depth][index];
		
		if(dp[depth][index] == null) {
			dp[depth][index] = Math.max(dp(depth+1,index),dp(depth+1, index+1)) + arr[depth][index];
		}
		
		return dp[depth][index];
	}

}
