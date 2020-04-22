package data_structure_2020;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


public class Num_14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			set1.add(br.readLine());
		}
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			set2.add(str);
			if(set1.contains(str)) count++;
		}
		/*
		 * set1.retainAll(set2);
		 * System.out.println(set1.size());
		 */

		System.out.println(count);	
		
		br.close();
	}
}