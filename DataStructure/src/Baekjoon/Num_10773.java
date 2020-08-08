package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack stack = new Stack();
		int time = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < time; i++) {
			int money = Integer.parseInt(br.readLine());
			if(money == 0 && !stack.isEmpty()) {
				stack.pop();
			} else {
				stack.add(money);
			}
		}
		int size = stack.size();
		for(int i = 0; i < size; i++) {
			sum += Integer.parseInt(stack.pop() + "");
		}
		System.out.println(sum);
	}

}
