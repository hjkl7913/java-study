package ch02;

public class VarEx03 {

	public static void main(String[] args) {
		char s1 = '가'; // 2Byte 
		System.out.println(s1);
		
		s1 = '나';   //s1 변수공간에 '가' 대신 '나'를 저장
		System.out.println(s1);
		
		char c1='가'; //공간이 있으면 아무곳에나 저장
		char c2='나';
		char c3='다';
		
		System.out.print(c1); //+ : 문자끼리 결합 결합연산자
		System.out.print(c2);
		System.out.print(c3);
		System.out.println();
		
		char[] str = {'가','나','다'}; //배열만들기 연속된공간이확보되있어야 저장가능 값을뺄때 효율적 
		System.out.print(str[0]);
		System.out.print(str[1]);
		System.out.print(str[2]);
		System.out.println();
		str[0] ='라';
		System.out.println(str[0]);
		//str[3]='파'; 오류
		
		}

}
