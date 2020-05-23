package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10866 {
//덱
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(order.equals("push_front")) {
				deque.addFirst(Integer.parseInt(st.nextToken()));
			} else if(order.equals("push_back")) {
				deque.addLast(Integer.parseInt(st.nextToken()));
			} else if(order.equals("pop_front")) {
				System.out.println((deque.isEmpty()? -1 : deque.pop())); // Deque에서 pop은 데이터를 와서 읽고 없앰
			} else if(order.equals("pop_back")) {
				System.out.println((deque.isEmpty()? -1 : deque.removeLast()) + "");
			} else if(order.equals("size")) {
				System.out.println(deque.size() + "");
			} else if(order.equals("empty")) {
				System.out.println((deque.isEmpty()? 1 : 0) + "");
			} else if(order.equals("front")) {
				System.out.println((deque.isEmpty()? -1 : deque.peekFirst()) + "");
			} else if(order.equals("back")) {
				System.out.println((deque.isEmpty()? -1 : deque.peekLast()) + "");
			}
		}
		br.close();
	}
}
