package array03;

import java.util.Scanner; //�ٸ���Ű���� Ŭ������ ����ϰ���������

/*
 * ���� 1000000000�� �Է¹ް�(10��)
 * 3�ڸ����� �޸��� �� ���
 * 1,000,000,000  5 9
 */

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // ���ڶ� ���ؼ� ���ڰ� ���ڰ��ȴ�. (������ ����ȯ)
		String tempNum2[] = tempNum.split(""); // split �и���Ų��. ex) a-b-c split("-")

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
		
		// System.out.println("����:"+tempNum2.length);
		/*
		 * for (int i = 0; i <tempNum2.length; i++) { if(i%3==0) {
		 * System.out.print(tempNum2[i]+","); } else { System.out.print(tempNum2[i]); }
		 * }
		 */

		
		  int len = tempNum2.length;
		 
		  for (int i = 0; i < len; i++) { //10������ for �� 
			  if ((len - i) % 3 == 0 && i !=0) { //4%3 , 3%3 , 2%3 , 1%3 ... 
				  	System.out.print(","); 
			  }
		  System.out.print(tempNum2[i]); 
		  }

		/*
		// �ڸ��� ����� ���� ����
		int p = (tempNum2.length % 3);
		for (int i = 0; i < tempNum2.length; i++) {
			// ù°�ڸ��տ� , �� ������ �ȵǴ� ù��������
			if (i == 0)
				tempNum2[i] = "" + tempNum2[i];
			// i�� 3���� �������� p���� ������ �տ�,�� ����
			else if (i % 3 == p)
				tempNum2[i] = "," + tempNum2[i];
			// �ڸ��� ��� ���
			System.out.print(tempNum2[i]);
		} //end of for */

	}

}
