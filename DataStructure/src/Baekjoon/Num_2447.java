//별 찍기 - 10
//https://www.acmicpc.net/problem/2447
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_2447 {
	static String square[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		square = new String[n][n];

		for(int i = 0; i < n; i++) {
			Arrays.fill(square[i], " "); // 모든 배열 요소 공백으로 초기화
		}
		
		star(0, 0, n); // 재귀함수 실행

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(square[i][j]); // 모든 배열 요소 출력
			}
			sb.append("\n"); // 한줄 끝내면 개행
		}
		System.out.println(sb.toString());
	}
	
	public static void star(int x, int y, int n) {
		int point = n/3;
		
		if(n == 1) {
			square[x][y] = "*";
			return;
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) { // 가운데 별은 비워놓는다
					continue;
				}
				star(x + point*i, y + point*j, point); // 그외 나머지는 별로 채워준다.
			}
		}
	}

}
