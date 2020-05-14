package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2110 {
//공유기 설치
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		int[] houses = new int[n+1];
		for(int i = 1; i <= n; i++) {
			houses[i] = Integer.parseInt(br.readLine());
		}
		Arrays.parallelSort(houses);
		
		int low = 1;
		int high = houses[n] - houses[1];
		int mid;
		int distance;

		
		while(low <= high) {
			mid = (low + high) / 2;
			int wifi = 1; // 공유기 처음집에 하나 설치했다고 생각
			
			int start = houses[1];
			for(int i = 2; i <= n; i++) {
				distance = houses[i] - start; // 집 사이의 거리구하기
				if(distance >= mid) {  // 거리가 mid값보다 크면 공유기 하나 설치
					wifi++;
					start = houses[i];
				}
			}
			
			if(wifi >= c) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		bw.write(high + ""); // 거리 최대값
		br.close();
		bw.flush();
		bw.close();
	}
}
