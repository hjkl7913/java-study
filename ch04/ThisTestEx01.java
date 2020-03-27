package ch04;

class AirPlane {
	String name;
	String color;
	
		public AirPlane(String name, String color) {
		this.name = name;
		this.color = color;
		
		//this 는 전역변수 동적으로 heap 공간을 가르킬수있다.
		//alt + shift + s + o 생성자 만드는 단축키
		}
		
}

public class ThisTestEx01 {

	public static void main(String[] args) {
		AirPlane a1 = new AirPlane("제트기", "하얀색");
		
		AirPlane a2 = new AirPlane("항공기", "노란색");

	}

}
