// 피보나치 수 2
//https://www.acmicpc.net/problem/2748
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_2748 {

	static int[] arr;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		System.out.println(fibo(n));
	}

	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
	}

}
