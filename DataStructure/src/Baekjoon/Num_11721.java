package Baekjoon;
/*
����
���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� �ܾ �־�����. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.
���
�Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
 */

import java.io.*;

public class Num_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		for(int i = 0; i < str.length(); i++) {
			char cut = str.charAt(i);
			System.out.print(cut);			
			if(i % 10 == 9)
				System.out.println();

		}

	}

}
