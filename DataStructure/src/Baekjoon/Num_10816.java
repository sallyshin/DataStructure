package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10816 {
// 숫자 카드 2
	static final int CARD = 20000001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] cards = new int[CARD];
		
		for(int i = 0; i < n; i++) {
			cards[Integer.valueOf(st.nextToken()) + 10000000] += 1;
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			sb.append(cards[Integer.valueOf(st.nextToken()) + 10000000] + " ");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();

	}

}
