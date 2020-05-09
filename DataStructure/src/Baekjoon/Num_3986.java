package Baekjoon;

import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Num_3986 {
// 좋은 단어
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
