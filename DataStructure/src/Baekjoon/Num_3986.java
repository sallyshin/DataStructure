package Baekjoon;

import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Num_3986 {
/*
 * . 만약 선끼리 교차하지 않으면서 각 글자를 정확히 한 개의 다른 위치에 있는 같은 글자와 짝 지을수 있다면, 
 * 그 단어는 '좋은 단어'이다. 평석이가 '좋은 단어' 개수를 세는 것을 도와주자.
입력
첫째 줄에 단어의 수 N이 주어진다. (1 ≤ N ≤ 100)
다음 N개 줄에는 A와 B로만 이루어진 단어가 한 줄에 하나씩 주어진다. 단어의 길이는 2와 100,000사이이며, 모든 단어 길이의 합은 1,000,000을 넘지 않는다.
출력
첫째 줄에 좋은 단어의 수를 출력한다.
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int good = 0;
		
		for(int i = 0; i < n; i++) {

			Stack stack = new Stack();
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				if(!stack.isEmpty()) {
					if((char)stack.peek() == str.charAt(j)) {
						stack.pop();
					}
					else {
						stack.push(str.charAt(j));
					}
				}
				else {
					stack.push(str.charAt(j));
				}
			}
			if(stack.isEmpty()) good += 1;
			else good += 0;
		}
		System.out.println(good);
	}

}
