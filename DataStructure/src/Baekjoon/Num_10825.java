package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10825 {
//국영수
	static class Person implements Comparable {
		public String name;
		public int kor;
		public int eng;
		public int math;
		
		public Person(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		public String getName() {
			return this.name;
		}
		@Override
		public int compareTo(Object o) {
			Person p = (Person) o;
			
			if(p.kor > this.kor) {
				return 1;
			}
			else if(p.kor < this.kor) {
				return -1;
			} else {
				if(p.eng > this.eng) {
					return -1;
				}
				else if(p.eng < this.eng) {
					return 1;
				} else {
					if(p.math < this.math) {
						return -1;
					}
					else if(p.math > this.math) {
						return 1;
					} else {
						return this.name.compareTo(p.name);
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Person arr[] = new Person[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			arr[i] = new Person(name, kor, eng, math);
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i].getName());
		}
		
		br.close();
	}

}
