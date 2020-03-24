package ch02;

public class VarEx02 {

	public static void main(String[] args) {
		double myNum = 10.5;  //8Byte 변수는 카멜표기법 사용
		System.out.println(myNum);
		
		int num1 = (int)myNum;
		System.out.println(num1); //소수점이하삭제
		
		int num2=10;
		double num3=num2;
		System.out.println(num3);	
	}
	
}
