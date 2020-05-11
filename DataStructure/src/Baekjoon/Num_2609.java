package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2609 {
//최대공약수와 최소공배수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Set<Integer> num1 = new HashSet<>();
		Set<Integer> num2 = new HashSet<>();
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				num1.add(i);
			}
		}
		for(int i = 1; i <= b; i++) {
			if(b % i == 0) {
				num2.add(i);
			}
		}
		num1.retainAll(num2);
		int result1 = 1;
		Iterator<Integer> itr = num1.iterator();
		while(itr.hasNext()) {
			int k = (int)itr.next();
			if(result1 < k) {
				result1 = k;
			}
		}
		int n = a / result1;
		int m = b / result1;
		int result2 = n * m * result1;
		bw.write(result1 + "\n" + result2);
		br.close();
		bw.flush();
		bw.close();
	}

}
