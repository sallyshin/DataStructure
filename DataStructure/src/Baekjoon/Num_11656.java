package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11656 {
// 접미사 배열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] arr = new String[s.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = "";
		}
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				arr[i] += s.charAt(j);
			}
		}
		Arrays.parallelSort(arr);
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "");
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
