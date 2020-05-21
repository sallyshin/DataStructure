package Baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class Num_11652 {
//카드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		HashMap<Long, Integer> map = new HashMap<>(); // HashMap에 long, int형으로 각각 key, value값을 담는다
		long max = 0; // max값은 long형으로
		
		for(int i = 0; i < n; i++) { // n번 입력
			long num = Long.parseLong(br.readLine());
			map.put(num, map.getOrDefault(num, 0) + 1); // map에서 key, value값 담기
			max = Math.max(max, map.get(num)); // max 값 구하기
		}
		
		List<Long> list = new ArrayList<>(); 
		/*
		 * 이 list에 max값에 해당하는 key값을 저장할것임. 그리고 sort해주기.
		 * 만약 여러개라면 가장 작은 값인 0번째 값을, 하나라면 그냥 0번째 값을 출력
		 */
		
		Iterator<Entry<Long, Integer>> itr = map.entrySet().iterator(); // value값이 최대인 것을 찾아 list에 저장
        while(itr.hasNext()){
            Map.Entry<Long, Integer> ent = (Map.Entry<Long, Integer>) itr.next();
            long Key = (long) ent.getKey();
            int Value = (int) ent.getValue();

            if(Value == max){
            	list.add(Key);
            }
        }
        Collections.sort(list);
        
        bw.write(list.get(0) + "");
        bw.flush();
		br.close();
		bw.close();
	}
}
