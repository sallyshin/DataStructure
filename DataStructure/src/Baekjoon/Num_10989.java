package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10989 {
// 수 정렬하기 3
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.parallelSort(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < n; i++) {
			bw.write(arr[i] + "\n");;
		}
		br.close();
		bw.close();
	}
}