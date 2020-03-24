package array03;

import java.util.Scanner;

public class Gugudan2 {

	// 사용자로 부터 입력받은 구구단 프로그램을 완성!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 시작합니다.");
		
		//while 문 빠져나갈때 break 쓴다.
		//boolean confirm = true;
		while (true) {
			System.out.println("숫자를 입력하세요 2~9");
			int num = sc.nextInt();

			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			} // end of for
			System.out.println("계속진행할까요? y or n");
			String check = sc.next();
			if (check.equals("n")) {
				//equals 는 ==으로 한번비교하고 동일하면 끝나지만 주소의 값까지 검사해준다.
				break; // 가장 가까운 반복문을 빠져나갈때 사용
				//confirm = false;
			}

		} // end of while

		System.out.println("구구단 프로그램 종료");
	} // end of main
} // end of class
