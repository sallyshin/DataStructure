package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10815 {
//숫자 카드
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN);

		int m = Integer.parseInt(br.readLine());
		int[] arrM = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			arrM[i] = Integer.parseInt(st.nextToken());
		}


//		for(int i = 0; i < m; i++) {
//			int min = 0;
//			int max = n-1;
//			int mid;
//
//			while(max >= min) {
//				mid = (min + max) / 2;
//
//				if(arrN[mid] > arrM[i]) {
//					max = mid - 1;
//				}
//				else if(arrN[mid] < arrM[i]) {
//					min = mid + 1;
//				}
//				else {
//					System.out.print(1 + " ");
//					break;
//				}
//			}
//			if(max < min) {
//				System.out.print(0 + " ");
//			}
//		}
	}

}
