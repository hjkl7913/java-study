package array03;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("����");
		String s2 = new String("����");
		
		//���ڿ��� ���Ҷ��� equals �� ����Ѵ�. (�˻縦 �ι��Ѵ�.)
		//String �ּҰ��� StringConstantPool �� ����Ǹ� �������� �����Ѵ�.
		System.out.println(s1==s2); //false ���ο�(heap)������ ���������
		System.out.println(s1.equals(s2)); //true
		
		String s3 = "����";
		String s4 = "����";
		System.out.println(s3==s4); //true �����ּҸ� �����Ƿ�
		
		System.out.println(s1==s4); //false 
		
		System.out.println(s1.equals(s4)); //true 

	}

}
