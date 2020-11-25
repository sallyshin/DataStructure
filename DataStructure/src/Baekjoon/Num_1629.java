//곱셈
//https://www.acmicpc.net/problem/1629
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_1629 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		System.out.println(pow(a, b, c));
	}
	public static long pow(int a, int b, int c) {
		if(b == 0) return 1;
		
		if(b == 1) return a%c;
		
		if(b % 2 == 0) {// 짝수이면
			long num = pow(a, b/2, c);
			long temp = num * num % c;
			return temp;
		} else {
			long temp = pow(a, b-1, c);
			return temp * a % c;
		}
		
	}
}
