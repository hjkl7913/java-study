package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("나무");
		String s2 = new String("나무");
		
		//문자열을 비교할때는 equals 를 써야한다. (검사를 두번한다.)
		//String 주소값은 StringConstantPool 에 저장되며 같은값은 공유한다.
		System.out.println(s1==s2); //false 새로운(heap)공간에 만들어져서
		System.out.println(s1.equals(s2)); //true
		
		String s3 = "나무";
		String s4 = "나무";
		System.out.println(s3==s4); //true 같은주소를 가지므로
		
		System.out.println(s1==s4); //false 
		
		System.out.println(s1.equals(s4)); //true 

	}

}
