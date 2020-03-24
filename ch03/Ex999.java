package ch03;

public class Ex999 {

	public static void main(String[] args) {
		char arr[] = {'가','나','다','라','마'};
		System.out.println(arr);
		char arr2[] = new char [5];
		for (int i = 0; i < arr2.length; i++) { 
			System.out.println(arr2[i]);
		}
		arr2[0] = arr[4];
        arr2[1] = arr[3];
        arr2[2] = arr[2];
        arr2[3] = arr[1];
        arr2[4] = arr[0];
       System.out.println(arr2);
			
	}

}
               