package ch02;

class Person {
	 String name ="ȫ�浿";
	 int age =28;
	 char gender = '��';
	 String email = "hjkl@naver.com";
	 String phone = "01012345689";
}


public class VarEx06 {

	public static void main(String[] args) {
		
		Person a = new Person();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.gender);
		System.out.println(a.email);
		System.out.println(a.phone);
		
	}

}
