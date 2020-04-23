package data_structure_2020;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class WordCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int max = 0;
		
		while(true) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			while(st.hasMoreTokens()) {
				String word = st.nextToken();
				char edit = word.charAt(word.length() -1);
				if(edit == ',' || edit == ';' || edit == '.'){
					word = word.substring(0, word.length()-1);
				}
				map.put(word, map.getOrDefault(word, 0) + 1);
				
				max = Math.max(max, map.get(word));
			}
			if(str.equals("")) {
				Set set = map.entrySet();
				Iterator itr = set.iterator();
				while(itr.hasNext()) {
					Map.Entry entry = (Map.Entry)itr.next();
					int Value = (int)entry.getValue();
					String Key = (String)entry.getKey();
					if(Value == max) {
						System.out.print(Key.toUpperCase());
					}
				}
				System.out.println(max);
			}
		}
	}

}
