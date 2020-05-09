package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_10814 {
//나이순 정렬
	static class Person implements Comparable {
		public int age;
		public String name;
		public int order;
		
		public Person(int age, String name, int order) {
			this.age = age;
			this.name = name;
			this.order = order;
		}
		
		public int getAge() {
			return this.age;
		}
		public String getName() {
			return this.name;
		}
		public int getOrder() {
			return this.order;
		}
		
		@Override
		public int compareTo(Object o) {
			Person p = (Person) o;
			
			if(this.age > p.age) {
				return 1;
			} 
			else if(this.age < p.age) {
				return -1;
			} else {
				if(this.order > p.order) {
					return 1;
				} else {
					return -1;
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
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int order = i;
			
			arr[i] = new Person(age, name, order);
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i].getAge() + " " + arr[i].getName());
		}
		
		br.close();
	}

}
