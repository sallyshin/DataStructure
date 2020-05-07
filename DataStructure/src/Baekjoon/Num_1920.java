package Baekjoon;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num_1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arrN = new int[n+1];
		for(int i = 1; i <= n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arrM = new int[m+1];
		for(int i = 1; i <= m; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= m; i++) {
			int max = n;
			int min = 1;
			int mid;
			
			while(max >= min) {
				mid = (min + max) / 2;
				
				if(arrN[mid] > arrM[i]) {
					max = mid - 1;
				}
				else if(arrN[mid] < arrM[i]) {
					min = mid + 1;
				} else { // arrN[mid] == arrM[j]
					System.out.println(1);
					break;
				}
			}
			if(max < min) {
				System.out.println(0);
			}
		}
	}
}