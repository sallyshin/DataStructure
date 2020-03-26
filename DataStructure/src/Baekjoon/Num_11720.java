package Baekjoon;
/*
����
N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
���
�Է����� �־��� ���� N���� ���� ����Ѵ�.
 */

import java.io.*;
import java.util.StringTokenizer;

public class Num_11720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();

		for(int i = 0; i < N; i++) {
			
			arr[i] = str.charAt(i) - 48;
			
			sum += arr[i];
		}

		System.out.println(sum);
		br.close();
	}

}
