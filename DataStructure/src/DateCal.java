import java.util.Scanner;

public class DateCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하시오 : ");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하시오 : ");
		int month = sc.nextInt();
		
		System.out.println("일을 입력하시오 : ");
		int day = sc.nextInt();
		System.out.printf("%d년 %d월 %d일은 ", year, month, day);
		boolean luna = true;
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				luna = false;
			} else if(year % 400 == 0) {
				luna = true;
			}
		}
		year -= 1900;
		int days = year * 365;
		
		if(luna && month == 2 || month == 1) {
			days--;
		}
		switch(month) {
		case 1:
			days += day;
			break;
		case 2:
			days += (31 + day);
			break;
		case 3:
			days += (31 + 28 + day);
			break;
		case 4 :
			days += (31 + 28 + 31 + day);
			break;
		case 5:
			days += (31 + 28+ 31+ 30 + day);
			break;
		case 6:
			days += (31 + 28 + 31 + 30 + 31 + day);
			break;
		case 7:
			days += (31 + 28 + 31 + 30 + 31 + 30 + day);
			break;
		case 8:
			days += (31 + 28 + 31 + 30 + 31 + 30 + 31 +day);
			break;
		case 9:
			days += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31+ day);
			break;
		case 10:
			days += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day);
			break;
		case 11:
			days += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day);
			break;
		case 12:
			days += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day);
			break;
		}

		int n = days % 7;
		switch(n) {
		case 0:
			System.out.println("일요일입니다.");
			break;
		case 1:
			System.out.println("월요일입니다.");
			break;
		case 2:
			System.out.println("화요일입니다.");
			break;
		case 3:
			System.out.println("수요일입니다.");
			break;
		case 4:
			System.out.println("목요일입니다.");
			break;
		case 5:
			System.out.println("금요일입니다.");
			break;
		case 6:
			System.out.println("토요일입니다.");
			break;
		}
	}

}
