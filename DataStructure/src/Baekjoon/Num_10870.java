//피보나치 수 5
//https://www.acmicpc.net/problem/10870
package Baekjoon;
import java.util.*;
import java.io.*;

public class Num_10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibo(n));
		
	}
	public static int fibo(int num) {
		if(num == 0) {
			return 0;
		} 
		else if(num == 1) {
			return 1;
		}
		return fibo(num-1) + fibo(num-2);
	}

}
