package Baekjoon;

import java.io.*;

public class Num_2440 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <=n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
