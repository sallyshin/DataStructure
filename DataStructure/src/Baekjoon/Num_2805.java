package Baekjoon;
import java.util.*;
import java.io.*;

public class Num_2805 {
	// 나무자르기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		long min = 0;
		long max = arr[n-1];
		long mid;

		while(min <= max) {
			mid = (min + max) / 2;
			long rest = 0;
			long sum = 0;
			
			for(int i = 0; i < n; i++) {
				rest = arr[i] - mid;
				if(rest <= 0) {
					sum += 0;
				} else {
					sum += rest;
				}
			}
			if(sum >= m) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		System.out.println(max);
	}
}
