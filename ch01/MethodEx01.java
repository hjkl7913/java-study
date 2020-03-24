package ch01;

//메서드(함수)는 클래스안에 작성할 수있다. (클래스 바로아래에 작성)
//메서드(함수)는 메서드(함수)안에 작성할 수 없다. 
public class MethodEx01 {

	static int add(int n1,int n2) { //void 리턴하지않는다.
		int result = n1 + n2;
		//System.out.println("result : "+result);
		return result; //return 가장 마지막에!!
	}
	
	//minus (매개변수는 int형 두개)(return은 int형)
	static int minus(int m1,int m2 ) {
		int res = m1 - m2;
		return res;
	}
	
	static int multi(int i1,int i2) {
		int resultm = i1 * i2;
		return resultm;
	}
	
	static int divide (int d1, int d2) {
		int resultd = d1 / d2;
		return resultd;
	}
	
	public static void main(String[] args) {
		int num = MethodEx01.add(5,3); //double로도 받아진다.
		System.out.println("더하기:"+num);
		//MethodEx01.add(5,3); 
		
		int num1 = MethodEx01.minus(5,3);
		System.out.println("빼기:"+num1);
		
		int num2 = MethodEx01.multi(5,3);
		System.out.println("곱하기:"+num2);
		
		int num3 = MethodEx01.divide(5,3);
		System.out.println("나누기:"+num3);
	}

}
