//다이얼
//https://www.acmicpc.net/problem/5622
package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sec = 0;

		System.out.println(str.length());
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			switch(a) {
			case 'A':
			case 'B':
			case 'C':
				sec += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				sec += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				sec += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				sec += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				sec += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				sec += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				sec += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				sec += 10;
				break;
			default:
				break;

			}
		}
		System.out.println(sec);
	}

}
