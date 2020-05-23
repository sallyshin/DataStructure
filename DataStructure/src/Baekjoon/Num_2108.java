package Baekjoon;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Num_2108 {
	// 통계학
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		double avg = 0;
		int mid = 0;
		int many = 0;
		long range = 0;
		long sum = 0;
		int [] arr = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			max = Math.max(max, map.get(arr[i]));
		}
		Arrays.parallelSort(arr);
		List<Integer> list = new ArrayList<>();
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();

		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			int Key = (int) entry.getKey();
			int Value = (int) entry.getValue();

			if(Value == max) {
				list.add(Key);
			}
		}
		Collections.sort(list);
		if(list.size() > 1) {
			many = list.get(1);
		} else {
			many = list.get(0);
		}

		int average = 0;
		if(sum < 0) {
			sum *= -1;
			avg = Math.round((sum * 10 / n) / 10.0);
			average = (int)avg * -1;
		} else {
			avg = Math.round((sum * 10 / n) / 10.0);
			average = (int)avg;
		}
		mid = arr[n/2];
		range = arr[n-1] - arr[0];
		bw.write(average +"\n" + mid+ "\n" + many + "\n" + range + "\n");
		bw.flush();

		br.close();
		bw.close();
	}

}
