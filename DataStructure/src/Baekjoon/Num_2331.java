package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num_2331 {
// 반복수열
    public static int[] arr = new int[1000000];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static int nextPow(int a, int p){ // 수의 일의자리부터 십의 자리, 백의 자리 순으로 p제곱수를 구하기
        int ans = 0; // 최종 답은 0으로 초기화
        while(a > 0){ // a가 0보다 클때
            ans += Math.pow(a % 10, p); // 일의자리 p제곱
            a /= 10; // a를 10을 ㅗ나눠주면 다음 일의자리는 십의자리
        }
        return ans; // ans 반환
    }
    public static int calculate(int a, int p, int cnt){ // 반복되는 곳 찾기
        if(arr[a] != 0){ // 만약 배열에 저장된 cnt수가 0이 아니라 이미 답이 정해져 있으면 그곳은부터 반복되는 숫자
            return arr[a] - 1; // 반복되는 수의 바로 이전 데이터는 답
        }
        arr[a] = cnt; // 배열의 a번째 인덱스에 cnt를 저장해주고
        return calculate(nextPow(a, p), p, cnt+1); // 다음 계산을 할 때마다 cnt에 1을 증가시켜줌
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        bw.write(calculate(d,p,1) + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
