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

public class Num_1822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))		;

		Set<Integer> setA = new HashSet();
		Set<Integer> setB = new HashSet();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int seta = Integer.parseInt(st.nextToken());
		int setb = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < seta; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < setb; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}

		setA.removeAll(setB);
		
		Iterator itr = setA.iterator();
		System.out.println(setA.size());
		List list = new ArrayList(setA);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}


	}
}
