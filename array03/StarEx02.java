package array03;

public class StarEx02 {

	static void printStarts(int i) {
			/*if(i==1) {
				for (int j = 0; j < 4-i; j++) {
					System.out.print("___");
				}
				for (int j = 0; j < i; j++) {
					System.out.println("*");
				}
				System.out.println();
			}
			if(i==2) {
				for (int j = 0; j < 4-i; j++) {
					System.out.print("__");
				}
				for (int j = 0; j < i; j++) {
					System.out.println("**");
				}
				System.out.println();
			}
			if(i==3) {
				for (int j = 0; j < 4-i; j++) {
					System.out.print("_");
				}
				for (int j = 0; j < i; j++) {
					System.out.println("***");
				}
				System.out.println();
			}
			if(i==4) {
				for (int j = 0; j < 4-i; j++) {
					System.out.print("");
				}
				for (int j = 0; j < i; j++) {
					System.out.println("****");
				}
				System.out.println();
			} */
		
		
		for (int j = 1; j < 4-i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			printStarts(i);	
		}

		/*System.out.println("___*"); //����3 ��1
		System.out.println("__**"); //����2 ��2
		System.out.println("_***"); //����1 ��3
		System.out.println("****"); //����0 ��4 */
	}

}
