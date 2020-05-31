package Baekjoon;
import java.util.*;
import java.io.*;

public class Num_1874 {
	// 스택 수열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int num = 1;
		boolean istrue = true;

		int n = Integer.parseInt(br.readLine()); // 8
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // 4 3 6 8 7 5 2 1

			if(num <= arr[i]) {
				while(num <= arr[i]) {
					stack.push(num);
					num++;
					sb.append("+ \n");
				}
			}
			if(stack.isEmpty()) {
				istrue = false; // 만약 숫자 리스트가 1 2 5 3 4 이면 3을 pop했을 때 4는 없기 때문에 스택이 비어있다. 그러면 4는 pop못함. 
			}
			else {
				if(num >= arr[i]) {
					while(stack.peek() >= arr[i]) {
						stack.pop();
						sb.append("- \n");
						if(stack.isEmpty()) break;
					}
				}
			}
		}
		if(istrue) {
			System.out.println(sb.toString());
		} else if(!istrue) {
			System.out.println("NO");
		}
	}
}
