package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11650 {
	//좌표 정렬하기
	static class XY implements Comparable { // Comparable interface 이용해 sort 기준 재정립
		public int x;
		public int y;

		public XY(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return this.x;
		}
		public int getY() {
			return this.y;
		}
		@Override
		public int compareTo(Object o) { // x와 y를 오름차순으로 정리
			XY xy = (XY)o;
			if(this.x > xy.x) {
				return 1;
			}
			else if (this.x < xy.x){
				return -1;
			} else {
				if(this.y > xy.y) {
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
		XY arr[] = new XY[n]; // XY객체 형 배열만들기
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[i] = new XY(x, y);
		}
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i].getX() + " " + arr[i].getY());
		}

		br.close();
	}

}
