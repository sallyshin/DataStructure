package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11651 {
//좌표 정렬하기2
	static class XY implements Comparable {
		public int x;
		public int y;
		
		public XY(int x, int y) {
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
		public int compareTo(Object ob) { // Comparable interface -> comapreTo(Object object)
			XY p = (XY)ob;
			
			if(p.y > this.y) {
				return -1;
			}
			else if(p.y < this.y) {
				return 1;
			}
			else {
				if(p.x > this.x) {
					return -1;
				} else {
					return 1;
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		XY arr[] = new XY[n];
		
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
	}

}
