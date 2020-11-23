//셀프넘버
package Baekjoon;
import java.util.*;
import java.io.*;

public class Num_4673 {
	public static boolean[] arr = new boolean[10001];
	
	public static void main(String[] args) throws IOException {
		
		for(int i = 1; i <= 10000; i++) {
			int num = Self_Number(i);
			if(num <= 10000) {
				arr[num] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 10000; i++) {
			if(!arr[i]) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb.toString());
	}
	
	public static int Self_Number(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += (number % 10);
			number /= 10;
		}
		return sum;
	}

}
