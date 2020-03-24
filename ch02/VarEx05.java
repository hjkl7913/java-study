package ch02;

/**
 * 
 * @author admin
 *
 */

class 동물 {  //클래스 자료형 
	 String name = "사자"; //static 변수가 italic된다.
	 String color = "노랑";
	 int speed = 100;
	 char gender = '여';
}

public class VarEx05 {
	static int num=10; //변수가 name이라도 동물 name 과다른공간이므로 상관없다.
	
	public static void main(String[] args) {
		System.out.println("동물 생성 준비");
		System.out.println(VarEx05.num);
		
		 동물 a = new 동물(); //heap 에 띄운다.
		 System.out.println(a.name);
		 System.out.println(a.color);
		 System.out.println(a.speed);
		 System.out.println(a.gender);
	}
}
