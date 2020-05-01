package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
public class Num_1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Deque<Integer> deq = new LinkedList<>();
		StringBuilder que = new StringBuilder();

		for(int i = 0; i < n; i++) {
			deq.add(i+1);
		}
		while(deq.size() != 0) {
			for(int i = 0; i < k-1; i++) {
				deq.addLast(deq.poll());
			}
			if(deq.size() == 1) {
				que.append(deq.pollFirst());
				break;
			}
			que.append(deq.pollFirst() + ", ");
		}
		System.out.println("<" + que.toString() + ">" );
	}

}
