package ch02;

public class VarEx07 {

	public static void main(String[] args) {
		//타입이 모호할때 사용하면 타입상관없이사용가능하지만 
		Object n1 = 1; 
		Object n2 = '가'; 
		Object n3 = "문자열"; 
		Object n4 = 10.5;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}
