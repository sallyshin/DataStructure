// 소트인사이드
// https://www.acmicpc.net/problem/1427
package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1427 {
	
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		arr = new int[10];
		
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) -'0']++;
		}
		
		StringBuilder sb = new StringBuilder();
		// 카운팅 소트
		
		for(int i = 0; i < 10; i++) {
			while(arr[i] > 0) {
				sb.append(i);
				arr[i]--;
			}
		}
		System.out.println(sb.reverse());
		br.close();
	}

}
