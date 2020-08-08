package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int time = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < time; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double sum = 0;
			double avg = 0;
			double result = 0;
			
			int students = Integer.parseInt(st.nextToken());
			int[] arr = new int[students];
			
			for(int j = 0; j < students; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			avg = sum / students;
			int count = 0;
			
			for(int k = 0; k < students; k++) {
				if(arr[k] > avg) count++;
			}
			
			result = Math.round(count * 1000000 / students / 10.0) / 1000.0;
			float f = Float.parseFloat(result + "");
			String str = String.format("%.3f", f);
			System.out.println(str + "%");
		}
	}

}
