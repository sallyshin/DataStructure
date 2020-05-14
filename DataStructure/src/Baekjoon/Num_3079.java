package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_3079 {
	// 입국심사
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		long [] arr = new long[(int) n];
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		long low = 1;
		long high;
		long max = 0;
		for(int i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		high = max*m; // 입력된 최대값의 m번만큼이 max값

		while(low <= high) {
			long mid = (low + high) / 2;
			long sum = 0;

			for(int i = 0; i < n; i++) {
				sum += mid / arr[i];
			}
			if(sum >= m) {
				high = mid - 1;
			} 
			else if(sum < m){
				low = mid + 1;
			}
		}
		System.out.println(low);
		br.close();
	}
}