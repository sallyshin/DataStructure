package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11653 {
	// 소인수분해
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        int divide = 2;
        while(n > 0){
            if(n % divide == 0){
                n /= divide;
                list.add(divide);
            } else{
                divide++;
            }
            if(n == 1){
                break;
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        br.close();
    }


}


