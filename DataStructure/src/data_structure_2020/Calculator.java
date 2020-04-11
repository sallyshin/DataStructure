package data_structure_2020;
import java.util.*;
import java.io.*;
public class Calculator {
	public static int priority(String c) {
		switch(c) {
		case "+":
		case "-":
			return 0;
		case "*":
		case "/":
		case "%":
			return 1;
		case "^":
			return 2;
		default:
			return 3;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<String> stack = new Stack<>();

		StringTokenizer num = new StringTokenizer(br.readLine(), " ");
		ArrayList<String> str = new ArrayList<>();

		while(num.hasMoreElements()) {
			str.add(num.nextToken());
		}

		StringBuilder sb = new StringBuilder();


		for(int i = 0; i < str.size(); i++) {
			String c = str.get(i);

			switch(c) {
			case "+":
			case "-":
			case "*":
			case "/":
			case "^":
			case "%":
				if(stack.isEmpty()) {
					stack.push(c);
					continue;
				}
				while(!stack.isEmpty() && priority(c) <= priority(stack.peek()) && !stack.peek().equals("(")) {
					sb.append(stack.pop() + " ");
				}
				stack.push(c);
				break;
			case "(":
				stack.push(c);
				break;
			case ")":
				while(!stack.isEmpty() && !stack.peek().equals("(")) {
					sb.append(stack.pop() + " ");
				}
				stack.pop();
				break;
			default :
				sb.append(c + " ");

			}
		}

		while(!stack.isEmpty()) {
			sb.append(stack.pop() + " ");
		}
		System.out.println(sb.toString());

		StringTokenizer st = new StringTokenizer(sb.toString(), " ");
		Stack<String> result = new Stack<String>();

		while(st.hasMoreElements()) {
			String k = st.nextToken();
			if(k.equals("+") || k.equals("-") || k.equals("*") || k.equals("/") || k.equals("%") || k.equals("^")) {
				long num2 = Long.parseLong(result.pop());
				long num1 = Long.parseLong(result.pop());
				switch(k) {
				case "+":
					result.push(Long.toString(num1 + num2));
					break;
				case "-":
					result.push(Long.toString(num1 - num2));
					break;
				case "*":
					result.push(Long.toString(num1 * num2));
					break;
				case "/":
					result.push(Long.toString(num1 / num2));
					break;
				case "^":
					result.push(Long.toString(Math.round(Math.pow(num1,  num2))));
					break;
				case "%":
					result.push(Long.toString(num1 % num2));
					break;
				}
			}
			else {
				result.push(k);
			}

		}
		System.out.println(result.pop());

	}

}
