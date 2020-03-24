package ch01;

public class OperEx02 {

	public static void main(String[] args) {
		int sum = 0; //int sum;  0이 들어가있다.  int sum = 0; 초기화했다.
		int distance = 100;
		int move = 20;
		
		sum = sum + move;          //sum = 0 + 20 = 20 
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);  // sum = 20 + 20 = 40 누적된다.

		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println("움직인거리:"+sum);  //결합 문자(String)+숫자(int) 문자로무조건 묵시적형변환 한다.
		System.out.println("도착지:"+distance); // +는 숫자끼리 연산 혹은 문자와 결합
	}

}
