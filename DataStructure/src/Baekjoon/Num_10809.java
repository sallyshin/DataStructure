package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [] ch = br.readLine().toCharArray();
		int [] arr = new int[26];

		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
			for(int j = 0; j < ch.length; j++) {
				if(ch[j] - 'a' == i && arr[i] == -1) {
					arr[i] = j;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}