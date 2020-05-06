import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 갯수 : ");
		int a = sc.nextInt();
		
		int zero = 0;
		int one = 1;

		
		for(int i = 0; i < a; i++) {
			int temp = zero + one;
			if( i <= 0) {
				System.out.println("f0 = " + zero);
			} else if( i <= 1) {
				System.out.println("f1 = " + one);
			} else {
				System.out.printf("f%d = %d",i, temp);
				zero = one;
				one = temp;
				System.out.println();
			}
		}
	}

}
