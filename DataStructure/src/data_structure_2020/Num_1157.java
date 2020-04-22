package data_structure_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine().toUpperCase();
		int [] ch = new int['Z' - 'A' + 1];
		int max = 0;

		int p = 0;
		for(int i = 0; i < str.length(); i++) {
			ch[str.charAt(i) - 'A']++;
			if(max < ch[str.charAt(i) - 'A']) {
				max = ch[str.charAt(i) - 'A'];
				p = str.charAt(i) - 'A';
			}
		}
		int count = 0;

		for(int i = 0; i < ch.length; i++) {
			if(max == ch[i]) {
				count++;
			}
		}
		if(count > 1) {
			System.out.println("?");
		}else {
			System.out.println((char)(p + 'A'));
		}
		br.close();
	}
}