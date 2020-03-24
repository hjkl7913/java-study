package ch03;

import ch03.MethodEx01;

public class MethodEx01 {


	
	public static void main(String[] args) {
		int num = Cal.add(5,3); //double로도 받아진다.
		System.out.println("더하기:"+num);
		//MethodEx01.add(5,3); 
		
		int num1 = Cal.minus(5,3);
		System.out.println("빼기:"+num1);
		
		int num2 = Cal.multi(5,3);
		System.out.println("곱하기:"+num2);
		
		int num3 = Cal.divide(5,3);
		System.out.println("나누기:"+num3);
	}
}
