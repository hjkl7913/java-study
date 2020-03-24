package array03;

public class ArrayEx01 {
//ctrl +shift +s  전체파일저장
	public static void main(String[] args) {
		//표현식은 바로 실행된다. 인수가1개이며 ; 으로 구분 ; 는 구분자라고한다.
		int num = 1;
		for (long i = 2L; i <= 200000000000000000L; i=i*2) { //반복 stack
			System.out.println("2의"+num+"승:"+i);
			num++;
		}
		
		/*while(true) { //무한반복 
			//끝이없이 계속 도는 프로세스에서 감시 역할을 하는것을 Daemon (데몬프로세스)라고 하며,  
			//Notify 하는 것은 리스너 라고도 부른다. 시간을 어느정도 두고 반복실행
		} */

	}

}
