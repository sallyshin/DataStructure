package Baekjoon;

import java.io.*;

public class Num_8393 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		
		System.out.println(total);

	}

}
