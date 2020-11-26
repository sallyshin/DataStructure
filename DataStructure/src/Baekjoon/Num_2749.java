//피보나치 수 3
//https://www.acmicpc.net/problem/2749
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_2749 {

	static long n;
	static long[] fibonacci;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Long.parseLong(br.readLine());

		/**
		 * 피사노 주기 : 피보나치 수를 k로 나눈 나머지는 항상 주기를 가진다.
		 * 만약 10^n으로 나누면 피사노 주기는 15 * 10^(n-1)
		 */
		int divide = 1000000;
		int pisano = 15*(divide/10);  

		fibonacci = new long[pisano];

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for(int i = 2; i <= n && i < pisano; i++) {
			fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % divide;
		}

		if(n >= pisano) {
			n %= pisano;
		}
		System.out.println(fibonacci[(int) n]);
	}
}