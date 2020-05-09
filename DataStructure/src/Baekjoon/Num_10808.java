package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10808 {
// 알파벳 갯수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		HashMap<Character, Integer> map = new HashMap<>();
		int[] arr = new int['z' - 'a' + 1];
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			arr[index]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		br.close();
	}

}
