package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num_2441 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		br.close();
	}

}
