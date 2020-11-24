//하노이 탑 이동 순서
//https://www.acmicpc.net/problem/11729
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_11729 {

	static int count;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		count = 0;
		Hanoi(1, 2, 3, k);
		System.out.println(count);
		System.out.println(sb.toString());
		br.close();
		
	}
	public static void Hanoi(int A, int B, int C, int n) {
		if(n == 1) {
			sb.append(A + " " + C).append("\n");
			count++;
			return;
		}
		Hanoi(A, C, B, n-1);
		sb.append(A + " " + C).append("\n");
		Hanoi(B, A, C, n-1);
		count++;
	}

}
