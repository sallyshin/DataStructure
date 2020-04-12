package data_structure_2020;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Week04_계산기 {
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
		Stack<String> stack = new Stack();

		StringTokenizer num = new StringTokenizer(br.readLine());
		ArrayList<String> str = new ArrayList<>();

		while(num.hasMoreTokens()) {
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
				sb.append(c);

			}
			while(!stack.isEmpty()) {
				sb.append(c + " ");
			}

		}
		System.out.println(sb.toString());
		
		StringTokenizer st = new StringTokenizer(sb.toString());
		
		Stack<String> result = new Stack();
		
		while(st.hasMoreTokens()) {
			String k = st.nextToken();
			
//			if(k.equals)
		}
	}

}
