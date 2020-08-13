package Baekjoon;
import java.io.*;
public class Num_9095 {
    public static int go(int sum, int goal){ // 재귀함수 만들기
        if(sum > goal) return 0; // 불가능한 경우 : 합이 주어진 숫자보다 클 때
        if(sum == goal) return 1; // 답이 나온 경우 
        int count = 0; // 다음 경우 호출, 시작은 0으로 카운트 시작
        for(int i = 1; i <= 3; i++){ // 1, 2, 3으로 더하기
            count += go(sum + i, goal); // 지금 값보다 합은 + i만큼 주어진 숫자는 그대로
        }
        return count; // 현재 count된 숫자 반환
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        int [] arr = new int[test];
        for(int i = 0; i < test; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sb.append(go(0, arr[i]) + "\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}