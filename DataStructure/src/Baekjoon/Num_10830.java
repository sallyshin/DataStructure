// 행렬 제곱
//https://www.acmicpc.net/problem/10830
package Baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_10830 {

	static int n;
	static int arr[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		arr = new int[n][n];
		int result[][] = new int[n][n];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		StringBuilder sb = new StringBuilder();
		result = pow(arr, b);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(result[i][j] % 1000 + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	public static int[][] calculate(int[][] arr1, int[][] arr2){
		int[][] result = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int sum = 0;
				for(int k = 0; k < n; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				result[i][j] = sum % 1000;
			}
		}
		return result;
	}
	public static int[][] pow(int[][] a, long b){
		if(b == 1) {
			return a;
		} 
		else if(b % 2 == 0) {
			int[][] temp = pow(a, b/2);
			return calculate(temp, temp);
		}
		int[][] temp = pow(a, b-1);
		return calculate(temp, a);
	}
}
