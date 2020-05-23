package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1181 {
	// 단어 정렬
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		List<String> list = new LinkedList<>();

		for(int i = 0; i < n; i++){
			String str = br.readLine();
			if(!list.contains(str)) {
				list.add(str);
			}
		}
		// Comparator은 커스터마이즈 된 정렬, 새로운 객체를 만들어서 비교하면 된다. 이 새로운 정렬방식은 sort(정렬대상, "정렬방식") 중 정렬방식에 적용
		Comparator<String> compareWord = new Comparator<String>() {
			public int compare(String a, String b) {
				int len = a.length() - b.length(); // 오름차순 정렬 : 나 - 비교대상
				if(len != 0) return len;
				return a.compareTo(b);
			}
		};
		Collections.sort(list, compareWord);
		

		for(int i = 0; i < list.size(); i++){
			bw.write(list.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();


	}
}
