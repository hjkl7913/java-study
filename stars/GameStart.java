package stars;

//다크템플러 DarkTempler(50),리버 River (70)
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
	final String NAME;  //final 불변데이터 ( 대문자면 데이터가 지정된이후 read only 데이터로 바뀜) 코드 컨벤션 
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
	
	//ctrl + w +w 블록지정
	//질럿이 드라군을 때린다
	static void attack(Zealot u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"이 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	//오버로딩
	static void attack(Dragoon u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"이 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(Zealot u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"이 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(Dragoon u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"이 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(Zealot u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(Zealot u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(Dragoon u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(Dragoon u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(DarkTempler u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(DarkTempler u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(DarkTempler u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(DarkTempler u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(River u1,Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	static void attack(River u1,Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(River u1,DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	
	static void attack(River u1,River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"가 공격당하고 있습니다.");
		System.out.println(u2.NAME+"의 체력은" +u2.hp+ "입니다.");
	}
	

	public static void main(String[] args) {
		//공격력 업그레이드 하기
		Zealot.attack++;
		//질럿 생성하기
		Zealot z1 = new Zealot("1번질럿");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2번질럿");
		System.out.println(Zealot.attack);
		
		Dragoon d1 = new Dragoon("1번드라군");
		System.out.println(Dragoon.attack);
		
		Dragoon d2 = new Dragoon("2번드라군");
		System.out.println(Dragoon.attack);
		
		DarkTempler t1 = new DarkTempler("1번다크템플러");
		System.out.println(DarkTempler.attack);
		
		DarkTempler t2 = new DarkTempler("2번다크템플러");
		System.out.println(DarkTempler.attack);
		
		River r1 = new River("1번리버");
		System.out.println(River.attack);
		
		River r2 = new River("2번리버");
		System.out.println(River.attack);
		
		//2번공격하기 질럿1 -> 드라군1
		attack(z1,d1);
		attack(z1,d1);
		
		//드라군1 -> 질럿1
		attack(d1,z1);
		
		//질럿1 -> 질럿2
		attack(z1,z2);
		
		//드라군1 -> 드라군2
		attack(d1,d2);
		
		//질럿1 -> 다크1
		attack(z1,t1);
		
		//질럿1 -> 다크2
		attack(z1,t2);
		
		//질럿1 -> 리버1
		attack(z1, r1);
		//질럿1 -> 리버2
		attack(z1, r2);
		
		//질럿2 -> 다크1
		attack(z2,t1);
		
		//질럿2 -> 다크2
		attack(z2,t2);
		
		//질럿2 -> 리버1
		attack(z2, r1);
		//질럿2 -> 리버2
		attack(z2, r2);
		
		//드라군1 -> 다크1
		attack(d1, t1);
		//드라군1 -> 다크2
		attack(d1, t2);
		
		//드라군1 -> 리버1
		attack(d1, r1);
		//드라군1 -> 리버2
		attack(d1, r2);
		
		//드라군2 -> 다크1
		attack(d2,t1);
		
		//드라군2 -> 다크2
		attack(d2,t2);
		
		//드라군2 -> 리버1
		attack(d2, r1);
		//드라군2 -> 리버2
		attack(d2, r2);
		
		//다크 1 -> 
		attack(t1, z1);
		attack(t1, z2);
		
		attack(t1, d1);
		attack(t1, d2);

		attack(t1, t1);
		attack(t1, t2);
		
		attack(t1, r1);
		attack(t1, r2);
		
		//다크 2 -> 
		attack(t2, z1);
		attack(t2, z2);
		
		attack(t2, d1);
		attack(t2, d2);

		attack(t2, t1);
		attack(t1, t2);
		
		attack(t2, r1);
		attack(t1, r2);
		
		//리버1 ->
		attack(r1, z1);
		attack(r1, z2);
		
		attack(r1, d1);
		attack(r1, d2);

		attack(r1, t1);
		attack(r1, t2);
		
		attack(r1, r1);
		attack(r1, r2);
		
		//리버2 ->
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





