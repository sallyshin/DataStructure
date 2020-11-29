// 파도반 수열
// https://www.acmicpc.net/problem/9461
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_9461 {

	static Long arr[] = new Long[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		arr[1] = arr[2] = arr[3] = 1L;

		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(P(num)).append("\n");
		}

		System.out.println(sb.toString());

	}
	public static long P(int num) {
		if(arr[num] == null) {
			arr[num] = P(num-2) + P(num-3);
		}
		return arr[num];
	}

}
