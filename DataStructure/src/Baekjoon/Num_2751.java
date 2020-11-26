// 수 정렬하기 2
// https://www.acmicpc.net/problem/2751
package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2751 {

	static int[] arr;
	static int[] result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		arr = new int[n+1];
		result = new int[n+1];

		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		merge_sort(1, n);

		for(int i = 1; i <= n; i++) {
			sb.append(arr[i] + "\n");
		}

		System.out.println(sb.toString());
	}

	public static void merge_sort(int left, int right){
		if(left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		merge_sort(left, mid);
		merge_sort(mid+1, right);
		merge(left, mid, right);
	}

	public static void merge(int left, int mid, int right) {
		int x = left;
		int y = mid+1;

		int start = left;

		while(x <= mid || y <= right) {
			if(x <= mid && y <= right) {
				if(arr[x] <= arr[y]) {
					result[start] = arr[x++];
				} 
				else if(arr[x] > arr[y]) {
					result[start] = arr[y++];
				} 
			}
			else if(x <= mid && y > right) {
				result[start] = arr[x++]; 
			}
			else if(x > mid && y <= right) {
				result[start] = arr[y++];
			}
			start++;
		}
		for(int i = left; i <= right; i++) { // 반드시 매번 정렬해준것 복사해주기
			arr[i] = result[i];
		}
	}

}
