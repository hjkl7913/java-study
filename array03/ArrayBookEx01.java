package array03;

import java.util.Random;
import java.util.Scanner;

public class ArrayBookEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Random r = new Random();
			int k = r.nextInt(100); // 0~99까지 임의의 정수 생성
			int i = 1;
			int max = 99;
			int min = 0;
			System.out.println("수를 결정 하였습니다. 맞추어 보세요.");
			System.out.println("0-99");

			while (true) {
				System.out.println(i+">>");
				int num = sc.nextInt();
			}

		} // end of while

	}

}