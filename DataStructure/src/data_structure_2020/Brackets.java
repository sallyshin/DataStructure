package data_structure_2020;
import java.util.*;
import java.io.*;
public class Brackets {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack stack = new Stack();

		while(true) {
			String sr = br.readLine();
			

			char[] str = sr.toCharArray();

			for(int i = 0; i < str.length; i++) {
				char c = str[i];

				if(!stack.isEmpty() && c == ')' && stack.peek() == '"') {
					while(!stack.isEmpty() && stack.peek() != '(') {
						stack.pop();
					}
					stack.pop();
				}

				else if(c == '(') {
					stack.push(c);
				}
				else if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
					stack.pop();
				}

				else if(c == '{') {
					stack.push(c);
				}
				else if(!stack.isEmpty() && c == '}') {
					stack.pop();
					
				}

			}
			if(sr.equals("}"))
				break;

		}
		if(stack.isEmpty()) {
			System.out.println("No Error");
		}
		else {
			System.out.println("Compile Error");
		}
	}

}
