// 색종이 만들기
// https://www.acmicpc.net/problem/2630
package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2630 {
	static int white = 0;
	static int blue = 0;
	static int[][] table;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		table = new int[n][n];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				table[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, n);
		System.out.println(white + "\n" + blue);
		br.close();
	}
	public static boolean check(int row, int col, int size) {
		int a = table[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++){
				if(a != table[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void divide(int row, int col, int size) {
		if(check(row, col, size)) {
			if(table[row][col] == 0) {
				white++;
			} else {
				blue++;
			}
		} else {
			int len = size/2;
			divide(row, col, len);
			divide(row, col+len, len);
			divide(row + len, col, len);
			divide(row + len, col + len, len);
		}
	}

}
