package data_structure_2020;
import java.io.*;
import java.util.StringTokenizer;
public class StampKey  {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] key = new int[n][n];//n by n
		int[][]	lock = new int[m][m];//m by m

		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int j = 0; j < n; j++) {
				key[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int j = 0; j < m; j++) {
				lock[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int newmap = m + 2*(n-1); // n-1 + m + n-1
		int map[][] = new int[newmap][newmap];

		for(int i = n-1; i < n - 1 + m; i++) { // lock = m, key = n
			for(int j = n-1; j < n - 1 + m; j++) {
				map[i][j] = lock[i - n + 1][j - n + 1];
			}
		}

		for(int i = 0; i < m + n - 1; i++) {
			for(int j = 0; j < m + n - 1; j++) {
				for(int u = 0; u < 4; u++) {
						for(int k = 0; k < n; k++) { // key = n-1 
							for(int p = 0; p < n; p++) {
								map[i+k][j+p] += key[k][p];
							}
						}
						int height = map[n-1][n-1];
						exit:
						for(int k = n-1; k < n - 1 + m; k++) {
							for(int p = n-1; p < n - 1 + m; p++) {
								if(k == n + m - 2 && p == n + m - 2 && height == map[k][p]) {
									System.out.println("Success");
									System.exit(0); // if success, end main()
								}
								if(height == map[k][p]) continue; 
								else break exit;

							}
						}
						for(int k = 0; k < n; k++) { // key = n-1 
							for(int p = 0; p < n; p++) {
								map[i+k][j+p] -= key[k][p];
							}
						}
						if(u != 3)
							key = rotation(key,n);
				}
				
				
			}
		}
		
		System.out.println("Fail");
		
	}
//to rotate array
	public static int[][] rotation(int[][] arr, int n){
		int[][] tmp = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				tmp[i][j] = arr[n-1-j][i];
			}
		}
		return tmp;
	}
}
