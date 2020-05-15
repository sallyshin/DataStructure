package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10816_BinarySearch {
	//숫자카드2-이분탐색
	public static int bsearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int maxIndex = 0;
		int minIndex = 0;
		int mid;

		while(low <= high) {
			mid = (low + high) / 2;
			if(arr[mid] >= target) {
				high = mid - 1;
				minIndex = mid;
			} else {
				low = mid + 1;
			}
		}
		low = 0; high = arr.length - 1;
		while(low <= high) {
			mid = (low + high) / 2;
			if(arr[mid] <= target) {
				low = mid + 1;
				maxIndex = mid;
			} else {
				high = mid - 1;
			}
		}
		if(arr[minIndex] != target && arr[maxIndex] != target) {
			return 0;
		}
		return maxIndex - minIndex + 1;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(m > 0) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(bsearch(arr, target));
			
			if(m != 0) {
				sb.append(" ");
			}
			m--;
		}
		br.close();
		bw.write(sb.toString() + "");
		bw.flush();
		bw.close();
		

	}

}
