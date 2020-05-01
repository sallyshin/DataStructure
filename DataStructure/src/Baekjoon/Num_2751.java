package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		
		for(int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
	}

}
