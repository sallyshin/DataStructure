package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11655 {
	// ROT13
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] ch = br.readLine().toCharArray();
		char[] result = new char[ch.length];
		for(int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if(c >= 65 && c <= 90) {
				int k = c + 13;
				if(k > 90) {
					k = k - 'Z' + 'A' - 1;
				}
				result[i] = (char)k;
			}
			else if(c >= 97 && c <= 122) {
				int k = c + 13;
				if(k > 122) {
					k = k - 'z' + 'a' - 1;
				}
				result[i] = (char)k;
			} else {
				result[i] = c;
			}
			
		}
		
		for(int i = 0; i < ch.length; i++) {
			bw.write(result[i] + "");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
