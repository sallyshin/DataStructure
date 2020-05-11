package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1676 {
	// 팩토리얼 0의 개수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		int two = 0;
		int five = 0;
		int temp;
		for(int i = 1; i <= n; i++) {
			temp = i;
			while(temp % 2 == 0) { // 2로 나눴을 때 0이면 계속 진행
				temp /= 2;
				two++;
			}
				
			while(temp % 5 == 0) {
				temp /= 5;
				five++;
			}
		}
		int k = Math.min(two, five);
		bw.write(k + "");
		br.close();
		bw.flush();
		bw.close();
	}
}
