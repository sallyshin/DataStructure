package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2750 {
//수 정렬하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		br.close();
	}

}