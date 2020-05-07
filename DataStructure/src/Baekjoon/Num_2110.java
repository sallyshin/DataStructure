package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2110 {
//공유기 설치
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] house = new int[n+1];
		
		for(int i = 1; i <= n
				; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house);
		
		int low = 1; // 최소 거리
		int high = house[n] - house[1]; // 가장 먼거리
		int distance; // 집사이의 간격
		int ans = 0; // 가장 인접한 공유기의 최대 거리 : 답
		
		
		while(low <= high) {
			int mid = (low + high) / 2;
			int start = house[1];
			int wifi = 1;
			
			for(int i = 2; i <= n; i++) {
				distance = house[i] - start;
				
				if(mid <= distance) {
					wifi++;
					start = house[i];
				}
			}
			
			if(wifi >= c) {
				low = mid + 1;
				ans = mid; // 근데 1 4 8 혹은 1 4 9 잖아. 1 4 8에서 끝나지 않아?
			} else {
				high = mid -1;
			}
		}
		System.out.println(ans);
	}
}
