//분해합
//https://www.acmicpc.net/problem/2231
package Baekjoon;

import java.util.*;
import java.io.*;

public class Num_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = n + ""; // 자리수 구하기위하여 String형으로 n 받아놓고
		
		int count = s.length(); // 길이를 구하면 자리수
		
		int ans = 0;
		
		for(int i = (n-count*9); i < n; i++) {
			int tmp = i;
			int sum = 0;
			
			while(tmp != 0) {
				sum += tmp % 10; // n의 각 자리수와 n을 더해준다
				tmp /= 10; // n한자리씩 읽기위함
			}
			if(sum + i == n) { // 각자리합과 i의 합이 n과 같으면 생성자를 찾은것임
				ans = i; // 생성자 i를 출력
				break;
			}
			//만약 답을 찾지 못했다면 생성자가 없다 : ans는 0을 출력
		}
		System.out.println(ans);
		br.close();
	}
	
}
