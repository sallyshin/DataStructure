package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2562 {
// 최댓값
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int[] copy = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			copy[i] = arr[i];
		}
		Arrays.sort(copy);
		System.out.println(copy[8]);
		for(int i = 0; i < 9; i++) {
			if(arr[i] == copy[8]) {
				System.out.println(i+1);
			}
		}
	}

}
