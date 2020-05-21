package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Num_1026 {
	//보물
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder()); 
		/*
		 * Collections.sort()는 내림차순이 아닌 리스트의 "구성을 반대로 뒤집는 것"
		 * 숫자를 내림차순으로 하려면 reverseOrder()을 사용해야함
		 */
		
		for(int i = 0; i < n; i++) {
			sum += a.get(i) * b.get(i);
		}
		bw.write(sum + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
