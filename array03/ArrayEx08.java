package array03;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
		/*int ch = 65;
		System.out.println((char)ch); //아스키코드
		int ch2 = 66;
		System.out.println((char)ch2); //아스키코드
		
		String input = "A";
		char c =input.charAt(0);
		System.out.println((int)c);
		
		System.out.println((int)'A');
		System.out.println((int)'Z'); */
		
		char abc = ch.charAt(0);
		for (int i = abc; i <90; i++) {
			System.out.println((char)(i+1));
		}
		
		/*char abc = ch.charAt(0);
		for (int i = abc+1; i <'Z'; i++) {
			System.out.println((char)i+"");
		} */

	}

}
