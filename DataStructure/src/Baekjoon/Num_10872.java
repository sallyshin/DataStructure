//팩토리얼
//https://www.acmicpc.net/problem/10872
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(factorial(n));
		br.close();
		
	}
	public static int factorial(int num) {
		if(num == 0) return 1;
		
		return num*factorial(num-1);
	}

}
