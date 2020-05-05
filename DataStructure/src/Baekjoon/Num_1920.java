package Baekjoon;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num_1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int [] arrayN = new int[n];
		for(int i = 0; i < n; i++) {
			arrayN[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int [] arrayM = new int[m];
		for(int i = 0; i < m; i++) {
			arrayM[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arrayN);
		
		for(int i = 0; i < m; i++) {
			int max = n-1;
			int min = 0;
			int mid;

			while(max >= min) {
				mid = (max + min) / 2;

				if(arrayN[mid] > arrayM[i]) {
					max = mid - 1;
				}
				else if(arrayN[mid] < arrayM[i]) {
					min = mid + 1;
				}
				else {
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
