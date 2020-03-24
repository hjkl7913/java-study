package array03;

import java.util.Scanner; //다른패키지에 클래스를 사용하고싶을때사용

/*
 * 숫자 1000000000를 입력받고(10억)
 * 3자리마다 콤마를 찍어서 출력
 * 1,000,000,000  5 9
 */

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // 문자랑 더해서 숫자가 문자가된다. (묵시적 형변환)
		String tempNum2[] = tempNum.split(""); // split 분리시킨다. ex) a-b-c split("-")

		/*
		 System.out.print(tempNum2[0]+","); 
		 System.out.print(tempNum2[1]);
		 System.out.print(tempNum2[2]); 
		 System.out.print(tempNum2[3]+",");
		 System.out.print(tempNum2[4]); 
		 System.out.print(tempNum2[5]);
		 System.out.print(tempNum2[6]+","); 
		 System.out.print(tempNum2[7]);
		 System.out.print(tempNum2[8]); 
		 System.out.print(tempNum2[9]);
		 */
		
		// System.out.println("길이:"+tempNum2.length);
		/*
		 * for (int i = 0; i <tempNum2.length; i++) { if(i%3==0) {
		 * System.out.print(tempNum2[i]+","); } else { System.out.print(tempNum2[i]); }
		 * }
		 */

		
		  int len = tempNum2.length;
		 
		  for (int i = 0; i < len; i++) { //10번도는 for 문 
			  if ((len - i) % 3 == 0 && i !=0) { //4%3 , 3%3 , 2%3 , 1%3 ... 
				  	System.out.print(","); 
			  }
		  System.out.print(tempNum2[i]); 
		  }

		/*
		// 자릿수 계산을 위한 변수
		int p = (tempNum2.length % 3);
		for (int i = 0; i < tempNum2.length; i++) {
			// 첫째자리앞에 , 이 붙으면 안되니 첫조건으로
			if (i == 0)
				tempNum2[i] = "" + tempNum2[i];
			// i를 3으로 나눈것이 p값과 같으면 앞에,을 붙임
			else if (i % 3 == p)
				tempNum2[i] = "," + tempNum2[i];
			// 자릿수 대로 출력
			System.out.print(tempNum2[i]);
		} //end of for */

	}

}
