// 01타일
// https://www.acmicpc.net/problem/1904
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_1904 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(Tile(n));
		
	}
	public static int Tile(int num) {
		
		if(num == 1) {
			return 1;
		} 
		else if(num == 2) {
			return 2;
		}
		int a = 1;
		int b = 2;
		int sum = 0;
		
		for(int i = 2; i < num; i++) {
			sum = ((a + b) % 15746);
			a = b;
			b = sum;
		}
		
		return sum;
	}
	/**
	 * 재귀로 풀이
	 * 	static int[] dp;
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(Tile(n));

		}
		public static int Tile(int num) {

		if(dp[num] == -1) {
			dp[num] = (Tile(num-1) + Tile(num-2))% 15746;
		}
		return dp[num];
		}
	 */

}
