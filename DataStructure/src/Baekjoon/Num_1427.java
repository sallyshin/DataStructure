package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1427 {
	// 소트인사이드
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine();
		List<Character> list = new ArrayList<>();
		for(int i = 0; i < num.length(); i++) {
			list.add(num.charAt(i));
		}
		Collections.sort(list);
		for(int i = num.length() - 1; i >= 0; i--) {
			bw.write(list.get(i) + "");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
