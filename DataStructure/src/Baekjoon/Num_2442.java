package Baekjoon;
/*
 * ����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ����
���� ����� �������� ��Ī�̾�� �Ѵ�.
�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.
���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num_2442 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n; i++) {

			for(int j = n-i; j > 0; j--) {

				System.out.print(" ");
				
			}
			for(int k = 1; k < 2*i; k++) {

				System.out.print("*");
					
			}
			System.out.println();
		}
		
		br.close();

	}

}
