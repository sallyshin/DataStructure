package Baekjoon;
import java.util.*;
import java.io.*;
public class Num_11004 {
	// K번째 수
	//퀵정렬로 풀자
	static int n,k;
	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return ;
		int piv = pi(arr, left, right);
		
		if(piv + 1 == k) return; // 피벗+1이 k랑 같으면 그냥 pivot을 출력해주고
		else if(piv+1 < k) { // k가 피벗 오른쪽 인덱스(피벗보다 크면) 위치하면
			quickSort(arr, piv + 1, right);	//오른쪽만 퀵정렬	
		}else {
			quickSort(arr, left, piv - 1); // k가 피벗 왼쪽 인덱스(피벗보다 작으면) 위치하면 왼쪽만 퀵정렬
		}
	}
	public static int pi(int[] arr, int left, int right) {
		int mid = (left + right) / 2; // 혹시 내림차순일 수 있으니까
		swap(arr, left, mid);

		int pivot = arr[left]; // 피벗은 기준. 시작지점
		int i = left; // 왼쪽에서 오른쪽으로
		int j = right; // 오른쪽에서 왼쪽으로

		while(i < j) {
			while(pivot < arr[j]) {
				j--; // 오른쪽부터 pivot보다  "작은수" 겟
			}
			while(pivot >= arr[i] && i < j) { 
				i++; // 왼쪽부터 pivot보다 "큰수" 겟
			}
			//둘이 바꿔주기
			swap(arr, i, j);
		}

		arr[left] = arr[i];
		arr[i] = pivot;

		return i;
	}
	public static void  swap(int[] arr, int a, int b) { // 두 데이터 바꿔주는 메소드
		int temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		quickSort(arr, 0, n-1);

		bw.write(arr[k-1]+"");
		br.close();
		bw.close();
	}

}
