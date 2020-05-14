package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2512 {
	// 예산
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] budget = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum += budget[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.parallelSort(budget);
		long total = Long.parseLong(br.readLine());

		long min = 1;
		long max = budget[n-1];
		long mid;
		long result = 0;

		if(sum <= total) {
			System.out.println(budget[n-1]);
		} else {
			while(min <= max) {
				mid = (min + max) / 2;
				sum = 0;

				for(int i = 0; i < n; i++) {
					sum += Math.min(budget[i], mid); // 중간값과 예산배열값 중 더 작은걸 합에 넣어야함(중간값이 상한선이기 때문)
				}

				if(sum <= total) { // 만약 합이 총 예산보다 작거나 같을 때
					result = mid; // 답이 나옴 : 중간값이 정답임
					min = mid + 1;
				} else {
					max = mid - 1; // 합이 총 예산보다 클때는 계속 이진탐색 진행
				}
			}
			System.out.println(result);
		}
		br.close();
	}

}
