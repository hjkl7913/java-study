package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person(); //인스턴스화 new 생성자호출, heap 띄운다
		p1.name = "최승희";
		p1.job = "의사";
		p1.gender = '여';
		p1.bloodType = "A";
		p1.age = 45;
		
		Person p2 = new Person();
		p2.name = "이미녀";
		p2.job = "골프선수";
		p2.gender = '여';
		p2.bloodType = "O";
		p2.age = 28;
		
		Person p3 = new Person();
		p3.name = "김미남";
		p3.job = "교수";
		p3.gender = '남';
		p3.bloodType = "AB";
		p3.age = 47;
		
		System.out.println(p3.name);
		System.out.println(p3.job);
		System.out.println(p3.gender);
		System.out.println(p3.bloodType);
		System.out.println(p3.age);
		
		//생성자와 순서가 무조건 같아야한다.
		Person p4 = new Person(
				"최주호",
				"강사",
				28,
				'남',
				"B"
		);
		System.out.println(p4.name);
		System.out.println(p4.job);
		System.out.println(p4.age);
		System.out.println(p4.gender);
		System.out.println(p4.bloodType);
		
		
	} //end of main

} //end of class
