package Baekjoon;

import java.io.*;

public class Num_2439 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
