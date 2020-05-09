package Baekjoon;
import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Num_1935 {
//후위 표기식
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack stack = new Stack();		
		int n = Integer.parseInt(br.readLine());
		double[] num = new double[n];
		char[] exp = br.readLine().toCharArray();
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine()); // 1 2 3 4 5 순서대로
		}
		
		for(int i = 0; i < exp.length; i++) {
			if(!Character.isUpperCase(exp[i])) {
				double num2 = (double)stack.pop();
				double num1 = (double)stack.pop();
				
				switch(exp[i]) {
				case '+':
					stack.push(num1 + num2);
					break;
				case '-':
					stack.push(num1 - num2);
					break;
				case '*':
					stack.push(num1 * num2);
					break;
				case '/':
					stack.push(num1 / num2);
					break;
				}
			}
			else {
				stack.push(num[exp[i] - 'A']); // 숫자로 넣기
			}
					
		}
		System.out.printf("%.2f", stack.pop());
		
	}

}
