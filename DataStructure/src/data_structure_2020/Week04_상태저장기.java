package data_structure_2020;
import java.util.StringTokenizer;

import week04.MyStack;
import week04.Status;

import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Week04_상태저장기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		MyStack<Status> stack = new MyStack<>();

		int min =0, max = 0;

		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			if(st.hasMoreTokens()) {
				String order = st.nextToken();

				if(order.equals("push")) {
					String num = st.nextToken(); // push 다음에 오는 숫자 저장
					int now = Integer.parseInt(num);

					if(stack.newlist.size() == 0) {
						min = now;
						max = now;
					}
					else {
						if(min > now) min = now;
						if(max < now) max = now;
					}
					stack.push(new Status(now, min, max));
				}
				else if(order.equals("pop")) {
					Status p = stack.pop();
					System.out.println(p);
					p = stack.pop();
					min = p.min;
					max = p.max;
					stack.push(p);
				}
				
			}
			
			
		}

	}

}
