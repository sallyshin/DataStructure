package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Num_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long v = Long.parseLong(st.nextToken());
		
		long day = 1 + ((v-a)%(a-b) == 0? (v-a)/(a-b) : (v-a)/(a-b)+1);
		System.out.println(day);
		/* 형뀨
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double V = Integer.parseInt(st.nextToken());
        br.close();
        int ans = (int) ((V - A) / (A - B));
        int dist = (int) ((A - B) * ans);
        while (V > dist) {
            dist += A;
            ans++;
            if (dist >= V) {
                break;
            }
            dist -= B;
        }
        System.out.println(ans);

		 */
	}
}
