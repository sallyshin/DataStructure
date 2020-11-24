//블랙잭
//https://www.acmicpc.net/problem/2798
package Baekjoon;
import java.util.*;
import java.io.*;

public class Num_2798 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(BlackJack(arr, n, m));
	}
	public static int BlackJack(int[] arr, int n, int m) {
		int result = 0;
		
		for(int i = 0; i < n-2; i++) { // 처음부터 탐색
			for(int j = i + 1; j < n-1; j++) { // 처음 바로 다음부터 탐색
				for(int k = j + 1; k < n; k++) { // 두번째 바로 다음부터 탐색
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == m) { // 합이 최대 m 과 같으면 바로 리턴하고 함수 종료
						return sum;
					}
					if(result < sum && sum < m) { // 합이 최대보다 작고 reuslt 보다 크면 result 갱신
						result = sum;
					}
				}
			}
		}
		return result;
	}

}
