package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11662 {
// 민호와 강호
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static double getDistance(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
	}
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		double ax = Double.parseDouble(st.nextToken());
		double ay = Double.parseDouble(st.nextToken());
		double bx = Double.parseDouble(st.nextToken());
		double by = Double.parseDouble(st.nextToken());
		
		double cx = Double.parseDouble(st.nextToken());
		double cy = Double.parseDouble(st.nextToken());
		double dx = Double.parseDouble(st.nextToken());
		double dy = Double.parseDouble(st.nextToken());
		
		int time = 1000000;
		
		double speedaxbx = (bx - ax) / time;
		double speedayby = (by - ay) / time;
		double speedcxdx = (dx - cx) / time;
		double speedcydy = (dy - cy) / time;
		
		double min = getDistance(ax, cx, ay, cy);
		
		for(int i = 1; i <= time; i++) {
			double temp = getDistance(ax + speedaxbx * i, cx + speedcxdx * i, ay + speedayby * i, cy + speedcydy * i);
			
			if(temp < min) min = temp;
		}
		
		System.out.println(min);
	}
	
}
