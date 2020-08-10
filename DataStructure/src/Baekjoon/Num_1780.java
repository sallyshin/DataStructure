package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//종이의 개수
public class Num_1780 {
	static int n;
	static int[][] arr;
	static int[] count = new int[3];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		solve(0, 0, n);

		for(int i = 0; i < 3; i++) {
			System.out.println(count[i]);
		}
	}
	public static boolean same(int row, int col, int n) {
		for(int i = row; i < row + n; i++) {
			for(int j = col; j < col + n; j++) {
				if(arr[row][col] != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void solve(int row, int col, int n) {
		if(same(row, col, n)) {
			count[arr[row][col] + 1]++;
		} else {
			int m = n / 3;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					solve(row + i*m, col + j*m, m);
				}
			}
		}
	}

}
