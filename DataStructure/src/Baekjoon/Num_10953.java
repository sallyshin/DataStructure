package Baekjoon;
/*
 ����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
 */

import java.util.StringTokenizer;
import java.io.*;
public class Num_10953 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a + b);
		}
		

	}

}
