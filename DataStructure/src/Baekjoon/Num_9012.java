package Baekjoon;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Num_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		restart:
			for(int i = 0; i < t; i++) {
				Stack stack = new Stack();
				String line = br.readLine();

				for(int j = 0; j < line.length(); j++) {
					if(line.charAt(j) == '(') {
						stack.push(line.charAt(j));
					}
					else if(line.charAt(j) == ')'){
						if(stack.isEmpty()) {
							System.out.println("NO");
							continue restart;
						}
						else {
							stack.pop();
						}
					}
				}
				if(stack.size() == 0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		br.close();
	}

}
