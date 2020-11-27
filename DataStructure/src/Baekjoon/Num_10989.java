// 수 정렬하기 3
// https://www.acmicpc.net/problem/10989

package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_10989 {

	static int[] arr;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int[10001];
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		// 카운팅 정렬
		for(int i = 0; i <= 10000; i++) {
			
			while(arr[i] > 0) {
				sb.append(i).append("\n");
				arr[i]--;
			}
		}
		System.out.println(sb.toString());
	}

}