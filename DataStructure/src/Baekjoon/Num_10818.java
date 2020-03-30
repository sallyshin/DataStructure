package Baekjoon;
/*
 * ����
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
 */
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_10818 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(str);
		
		for(int i = 0; i < n; i++) {
			arr[i] =Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[n-1]);
	}

}
