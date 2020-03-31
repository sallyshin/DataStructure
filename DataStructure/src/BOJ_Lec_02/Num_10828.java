package BOJ_Lec_02;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Num_10828 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();

		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			String order = st.nextToken();

			if(order.equals("push")) { // 넣는연산
				int num = Integer.parseInt(st.nextToken());
				stack.add(num);
			}
			else if(order.equals("pop")) { // 빼고, 출력, 빈 스택이면 -1 출력
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.pop());
				}
			}
			else if(order.equals("size")) { // 스택에 있는 정수갯수 출력
				System.out.println(stack.size());
			}
			else if(order.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if(order.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
			}
		}

		br.close();
		
	}

}
