//행렬곱셈
//https://www.acmicpc.net/problem/2740
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_2740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first_row = Integer.parseInt(st.nextToken());
		int first_column = Integer.parseInt(st.nextToken());
		int first[][] = new int[first_row][first_column];
		
		for(int i = 0; i < first_row; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < first_column; j++) {
				first[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int second_row = Integer.parseInt(st.nextToken());
		int second_column = Integer.parseInt(st.nextToken());
		int second[][] = new int[second_row][second_column];
		
		for(int i = 0; i < second_row; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < second_column; j++) {
				second[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < first_row; i++) {
			for(int j = 0; j < second_column; j++) {
				int sum = 0;
				for(int k = 0; k < first_column; k++) {
					sum += first[i][k] * second[k][j];
				}
				sb.append(sum + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}

}
