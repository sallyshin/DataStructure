package BOJ_Lec_02;
import java.util.LinkedList;
import java.util.Deque;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			String order = st.nextToken();
			
			if(order.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				q.addLast(num);
			}
			else if(order.equals("size")) {
				System.out.println(q.size());
			}
			else if(order.equals("empty")) {
				if(q.size() == 0) System.out.println(1);
				else System.out.println(0);
			}
			else if(order.equals("front")) {
				if(q.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(q.peekFirst());
				}
			}
			else if(order.equals("back")) {
				if(q.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(q.peekLast());
				}
			}
			else if(order.equals("pop")) {
				if(q.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(q.pollFirst());
				}
			}
		}
		br.close();
	}

}
