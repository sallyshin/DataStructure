package Baekjoon;
import java.util.Stack;
import java.io.*;
public class Num_4949 {
// 균형잡힌세상
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {

			String str = br.readLine();
			Stack stack = new Stack();
			
			if(str.length() == 1 && str.equals(".")) System.exit(0); // 입력값이 . 하나이면 입력 종료
			
			for(int i = 0; i < str.length(); i++) {
				char s = str.charAt(i); 
				if(s == '(' || s == '[') { // i번째 문자가 열린괄호면 push
					stack.push(s);
				}
				else if(s == ')' || s == ']') { // i번째 문자가 닫힌괄호면 
					if(!stack.isEmpty() && s == ')' && (char)stack.peek() == '(') { // 처음입력이 아니고 peek했을 때 짝괄호면 pop
						stack.pop();
					}
					else if(!stack.isEmpty() && s == ']' && (char)stack.peek() == '[') { // 처음입력이 아니고 peek했을 때 짝괄호면 pop
						stack.pop();
					}
					else stack.push(s); // 아니면 push
				}
				else if(s == '.' && str.length() != 1) { // 문자열에 공백 외에 .하나만 입력했을 때 넣다 뺴줌 = empty만들기 위해
					stack.push(s);
					stack.pop();
				}
			}
			if(stack.isEmpty()) System.out.println("yes");
			else System.out.println("no");

		}
	}

}
