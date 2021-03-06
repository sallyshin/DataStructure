package Baekjoon;
import java.util.*;
import java.io.*;

public class Num_2805 {
	// 나무자르기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());

		int[] tree = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(tree);

		int low = 0; // 최소값은 0이 되어야 한다.
		int high = tree[n-1]; // 최대값은 입력한 값중에 제일 높은 나무길이
		long mid;

		while(low <= high) {
			mid = (low + high) / 2;
			long restTree = 0;
			long totalTree = 0;
			
			for(int i = 0; i < n; i++) {
				restTree = tree[i] - mid;
				if(restTree <= 0) {
					totalTree += 0;
				} else {
					totalTree += restTree;
				}
			}

			if(totalTree >= m) {
				low = (int)mid + 1;
			} else if (totalTree < m){
				high = (int)mid - 1;
			}
		}
		bw.write(high + "");
		br.close();
		bw.flush();
		bw.close();
	}
}
