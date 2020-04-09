package BOJ_Lec_02;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Num_1918 {
	public static int priority(char c) {
		if(c == '(' || c == ')') {
			return 0;
		}
		else if(c == '+' || c == '-') {
			return 1;
		}
		return 2;
	}	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();

		char[] str = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < str.length; i++) {
			char c = str[i];

			switch(c) {
			case '+':
			case '-':
			case '*':
			case '/':
				while(!stack.isEmpty() && priority(c) <= priority(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(c);
				break;
			case '(':
				stack.push(c);
				break;
			case ')':
				while(!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
				break;
			default:
				sb.append(c);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());

	}
}
