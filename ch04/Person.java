package ch04;

//상태와 행동
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	//디폴트 생성자(매개변수가 없는 아이) = 초기화 (없으면  컴파일러가 자동으로 만들어준다.)
	public Person() {
		
	}
	//생성자를 하나 만들면 컴파일러가 디폴트 생성자를 자동으로 생성해주지않음으로 오류가 생김 
	//오버로딩 모든프로그램에 다있음 함수명이같아도 매개변수 타입이 다르면 다른함수로 인식
	/*System.out.println(); static 공간
	System.out.println('가');  println 컨+엔
	System.out.println(10.5);
	System.out.println(10L);*/
	//마우스 우클릭 소스 using field
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	

		
	
}
