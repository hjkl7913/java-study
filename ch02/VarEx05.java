package ch02;

/**
 * 
 * @author admin
 *
 */

class ���� {  //Ŭ���� �ڷ��� 
	 String name = "����"; //static ������ italic�ȴ�.
	 String color = "���";
	 int speed = 100;
	 char gender = '��';
}

public class VarEx05 {
	static int num=10; //������ name�̶� ���� name ���ٸ������̹Ƿ� �������.
	
	public static void main(String[] args) {
		System.out.println("���� ���� �غ�");
		System.out.println(VarEx05.num);
		
		 ���� a = new ����(); //heap �� ����.
		 System.out.println(a.name);
		 System.out.println(a.color);
		 System.out.println(a.speed);
		 System.out.println(a.gender);
	}
}
