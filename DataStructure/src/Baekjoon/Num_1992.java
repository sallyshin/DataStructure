//쿼드트리
//https://www.acmicpc.net/problem/1992
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_1992 {
	static int n, m;
	static StringBuilder sb;
	
	static int qtree[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		
		qtree = new int[size][size];
		
		for(int i = 0; i < size; i++){
			String str = br.readLine();
			for(int j = 0; j < size; j++) {
				qtree[i][j] = Integer.parseInt(str.charAt(j) + "");
			}
		}
		
		divide(0, 0, size);
		System.out.println(sb.toString());
	}
	
	public static boolean check(int row, int col, int size) {
		int num = qtree[row][col];
		
		for(int i = row; i < row+size; i++) {
			for(int j = col; j < col + size; j++) {
				if(num != qtree[i][j]) {
					return false;
				}
			}
		}
		n = num;
		return true;
	}
	
	public static void divide(int row, int col, int size) {
		
		if(check(row, col, size)) {
			sb.append(n);
		} else {
			sb.append("(");
			int new_size = size/2;
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					divide(row + i * new_size, col + j * new_size, new_size);
				}
			}
			sb.append(")");
		}
	}

}
