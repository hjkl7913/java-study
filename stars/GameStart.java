package stars;

//��ũ���÷� DarkTempler(50),���� River (70)
class DarkTempler {
	final String NAME;
	int hp;
	static int attack=50;
	
	public DarkTempler(String name) {
		this.NAME = name;
		this.hp = 100;
	}
	
}

class River {
	final String NAME;
	int hp;
	static int attack=70;
	
	public River(String name) {
		this.NAME = name;
		this.hp = 100;
	}
	
}

class Zealot{
	final String NAME;  //final �Һ������� ( �빮�ڸ� �����Ͱ� ���������� read only �����ͷ� �ٲ�) �ڵ� ������ 
	int hp;
	static int attack=10;
	
	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100;
	}
	
}

class Dragoon {
	final String NAME;
	int hp;
	static int attack=15;
	
	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;
	}
	
}

public class GameStart {
	
	//ctrl + w +w �������
	//������ ����� ������
	static void attack(Zealot u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	//�����ε�
	static void attack(Dragoon u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(Zealot u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(Dragoon u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(Zealot u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(Zealot u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(Dragoon u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(Dragoon u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(DarkTempler u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(River u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	static void attack(River u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(River u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	
	static void attack(River u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü����" +u2.hp+ "�Դϴ�.");
	}
	

	public static void main(String[] args) {
		//���ݷ� ���׷��̵� �ϱ�
		Zealot.attack++;
		//���� �����ϱ�
		Zealot z1 = new Zealot("1������");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2������");
		System.out.println(Zealot.attack);
		
		Dragoon d1 = new Dragoon("1�����");
		System.out.println(Dragoon.attack);
		
		Dragoon d2 = new Dragoon("2�����");
		System.out.println(Dragoon.attack);
		
		DarkTempler t1 = new DarkTempler("1����ũ���÷�");
		System.out.println(DarkTempler.attack);
		
		DarkTempler t2 = new DarkTempler("2����ũ���÷�");
		System.out.println(DarkTempler.attack);
		
		River r1 = new River("1������");
		System.out.println(River.attack);
		
		River r2 = new River("2������");
		System.out.println(River.attack);
		
		//2�������ϱ� ����1 -> ���1
		attack(z1,d1);
		attack(z1,d1);
		
		//���1 -> ����1
		attack(d1,z1);
		
		//����1 -> ����2
		attack(z1,z2);
		
		//���1 -> ���2
		attack(d1,d2);
		
		//����1 -> ��ũ1
		attack(z1,t1);
		
		//����1 -> ��ũ2
		attack(z1,t2);
		
		//����1 -> ����1
		attack(z1, r1);
		//����1 -> ����2
		attack(z1, r2);
		
		//����2 -> ��ũ1
		attack(z2,t1);
		
		//����2 -> ��ũ2
		attack(z2,t2);
		
		//����2 -> ����1
		attack(z2, r1);
		//����2 -> ����2
		attack(z2, r2);
		
		//���1 -> ��ũ1
		attack(d1, t1);
		//���1 -> ��ũ2
		attack(d1, t2);
		
		//���1 -> ����1
		attack(d1, r1);
		//���1 -> ����2
		attack(d1, r2);
		
		//���2 -> ��ũ1
		attack(d2,t1);
		
		//���2 -> ��ũ2
		attack(d2,t2);
		
		//���2 -> ����1
		attack(d2, r1);
		//���2 -> ����2
		attack(d2, r2);
		
		//��ũ 1 -> 
		attack(t1, z1);
		attack(t1, z2);
		
		attack(t1, d1);
		attack(t1, d2);

		attack(t1, t1);
		attack(t1, t2);
		
		attack(t1, r1);
		attack(t1, r2);
		
		//��ũ 2 -> 
		attack(t2, z1);
		attack(t2, z2);
		
		attack(t2, d1);
		attack(t2, d2);

		attack(t2, t1);
		attack(t1, t2);
		
		attack(t2, r1);
		attack(t1, r2);
		
		//����1 ->
		attack(r1, z1);
		attack(r1, z2);
		
		attack(r1, d1);
		attack(r1, d2);

		attack(r1, t1);
		attack(r1, t2);
		
		attack(r1, r1);
		attack(r1, r2);
		
		//����2 ->
		attack(r2, z1);
		attack(r2, z2);
		
		attack(r2, d1);
		attack(r2, d2);

		attack(r2, t1);
		attack(r2, t2);
		
		attack(r2, r1);
		attack(r2, r2);
	}

}





