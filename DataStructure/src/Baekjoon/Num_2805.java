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

		int min = 0;
		int max = arr[n-1];
		int mid;
		
		while(min <= max) {
			mid = (min + max) / 2;
			
			int restTree = 0;
			long sumTree = 0;
			for(int i = 0; i < n; i++) {
				restTree = arr[i] - mid;
				if(restTree < 0) {
					restTree = 0;
				}
				sumTree += restTree;
			}
			
			if(m > sumTree) {
				max = mid - 1;
			} 
			else if(m <= sumTree){
				min = mid + 1;
			}
		}
		System.out.println(max);
	}
}
