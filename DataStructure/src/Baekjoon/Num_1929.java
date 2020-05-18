package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_1929 {
/**
 * 에라토스테네스의 방법 알고리즘으로 풀어야 시간초과가 나지 않는다.
 */
// 소수 구하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        int [] arr = new int[n+1]; // 0과 1 ~ n 사이의 배열 생성
        arr[1] = 1; // 1은 소수에서 제외
        for(int i = 2; i <= n; i++) {
        	arr[i] = 0; // 2부터 0으로 초기화
        }
        
        for(int i = 2; i <= n; i++) { // 2부터 n까지
        	for(int j = 2; j * i <= n; j++) { // 2부터 n까지 n이 정수의 곱으로 나타낼 수 있으면 
        		arr[i * j] = 1; // 배열의 값을 1로 바꿈
        	}
        }
        for(int i = m; i <= n; i++) { // m부터 n까지
        	if(arr[i] != 1) { // 정수의 곱으로 나타낼 수 없으면 = 소수이면
        		bw.write(i + "\n"); // 출력
        	}
        }
        
        br.close();
        bw.flush();
        bw.close();

	}

}
