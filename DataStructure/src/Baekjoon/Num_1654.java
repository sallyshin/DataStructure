package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1654 {
// 랜선 자르기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken()); // k개로
		int n = Integer.parseInt(st.nextToken()); // n개를 만들기
		int [] arr = new int[k];
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		long low = 1;
		long high = arr[k-1];
		long mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			long sum = 0;
			for(int i = 0; i < k; i++) {
				sum += (arr[i] / mid);
			}
			if(sum >= n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(high);
	}

}
