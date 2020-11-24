//덩치
//https://www.acmicpc.net/problem/7568
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int big[][] = new int[n][2];
		StringBuilder sb = new StringBuilder();
		
		int rank;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			big[i][0] = Integer.parseInt(st.nextToken()); // weight
			big[i][1] = Integer.parseInt(st.nextToken()); // height
		}
		
		for(int i = 0; i < n; i++) {
			rank = 1;
			
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				
				if(big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
					rank++;
				}
			}
			sb.append(rank + " ");
		}
		
		System.out.println(sb.toString());
		
	}

}
