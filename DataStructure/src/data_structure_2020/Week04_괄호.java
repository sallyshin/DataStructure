package data_structure_2020;
import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Week04_괄호 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();

		while(true) {
			String str = br.readLine();
			char[] ch = str.toCharArray();

			for(int i = 0; i < str.length(); i++) {
				char c = ch[i];
				
				if(!stack.isEmpty() && c == ')' && stack.peek() == '"') {
					while(!stack.isEmpty() && stack.peek() != '(') {
						stack.pop();
					}
					stack.pop();
					
				}
				else if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
					stack.pop();
				}
				else if(!stack.isEmpty() && c == '}' && stack.peek() == '{') {
					stack.pop();
				}
				else if(c == '{') {
					stack.push(c);
				}
				else if(c == '(') {
					stack.push(c);
				}

			}
			if(str.equals("}")) {
				break;
			}
			
		}
		if(stack.isEmpty()) {
			System.out.println("No Error");
		}
		else {
			System.out.println("Compile Error");
		}


	}
}

