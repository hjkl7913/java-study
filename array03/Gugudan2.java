package array03;

import java.util.Scanner;

public class Gugudan2 {

	// ����ڷ� ���� �Է¹��� ������ ���α׷��� �ϼ�!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����մϴ�.");
		
		//while �� ���������� break ����.
		//boolean confirm = true;
		while (true) {
			System.out.println("���ڸ� �Է��ϼ��� 2~9");
			int num = sc.nextInt();

			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			} // end of for
			System.out.println("��������ұ��? y or n");
			String check = sc.next();
			if (check.equals("n")) {
				//equals �� ==���� �ѹ����ϰ� �����ϸ� �������� �ּ��� ������ �˻����ش�.
				break; // ���� ����� �ݺ����� ���������� ���
				//confirm = false;
			}

		} // end of while

		System.out.println("������ ���α׷� ����");
	} // end of main
} // end of class
