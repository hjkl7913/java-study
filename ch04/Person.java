package ch04;

//���¿� �ൿ
public class Person {
	String name;
	String job;
	int age;
	char gender;
	String bloodType;
	
	//����Ʈ ������(�Ű������� ���� ����) = �ʱ�ȭ (������  �����Ϸ��� �ڵ����� ������ش�.)
	public Person() {
		
	}
	//�����ڸ� �ϳ� ����� �����Ϸ��� ����Ʈ �����ڸ� �ڵ����� ������������������ ������ ���� 
	//�����ε� ������α׷��� ������ �Լ����̰��Ƶ� �Ű����� Ÿ���� �ٸ��� �ٸ��Լ��� �ν�
	/*System.out.println(); static ����
	System.out.println('��');  println ��+��
	System.out.println(10.5);
	System.out.println(10L);*/
	//���콺 ��Ŭ�� �ҽ� using field
	public Person(String name, String job, int age, char gender, String bloodType) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
	

		
	
}
