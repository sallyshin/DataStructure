package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10820 {
// 문자열 분석 : 소문자, 대문자, 숫자, 공백
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			String st = br.readLine();
			if(st == null) break; // BufferedReader가 입력값이 없으면 객체를 비교해줘야한다.

			int[] time = {0, 0, 0, 0};
			char[] ch = st.toCharArray();
			for(int i = 0; i < ch.length; i++) {
				char c = ch[i];
				if(c == ' ') {
					time[3]++;
				}
				else if(c >= '0' && c <= '9') {
					time[2]++;
				}
				else if(c >= 'a' && c <= 'z') {
					time[0]++;
				}
				else if(c >= 'A' && c <= 'Z') {
					time[1]++;
				}
			}
			bw.write(time[0] + " " + time[1] + " " + time[2] + " "+ time[3] + "\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
