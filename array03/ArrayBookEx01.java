package array03;

import java.util.Random;
import java.util.Scanner;

public class ArrayBookEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Random r = new Random();
			int k = r.nextInt(100); // 0~99���� ������ ���� ����
			int i = 1;
			int max = 99;
			int min = 0;
			System.out.println("���� ���� �Ͽ����ϴ�. ���߾� ������.");
			System.out.println("0-99");

			while (true) {
				System.out.println(i+">>");
				int num = sc.nextInt();
			}

		} // end of while

	}

}