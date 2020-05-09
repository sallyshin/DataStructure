package Baekjoon;
import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Num_10799 {
다시 //쇠막대기
//https://www.acmicpc.net/problem/10799
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack();
		char[] ch = new char[str.length()];

		int count = 0;

		for(int i = 0; i < str.length(); i++) {
			char c = ch[i];

			if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
				stack.pop();
				count += stack.size();
			}

			else if(!stack.isEmpty() && c == '(' && stack.peek() == '('){
				stack.push(c);
				count += stack.size();
			}
			else if(stack.isEmpty()){
				stack.push(c);
				count += 1;
			}
			if(i == str.length()-1) {
				System.out.println(count);
			}

		}
		
	}

}
