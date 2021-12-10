import java.util.Scanner;

public class CMain2 {

	public static void main(String[] args) {
		//반복문 10번 -> 반복문 한번다 안녕하세요 x 3번씩
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if(i == 3) {
//				continue;
//			}
//			System.out.println("안녕하세요 1");
//			System.out.println("안녕하세요 2");
//			System.out.println("안녕하세요 3");
//		}
//		System.out.println("---------------------------");
//		
//		for (int i = 0; i < 10; i++) {
//			if(i%2 == 0) {
//				System.out.println("와!");
//			} else {
//				continue; //강제반복(턴종료) -> 홀수일때는 무시하고, 다음으로 넘어간다
//				break; //(공식적), 반복문 끝
//				return;//(비공식적), 함수가 끝
//			}
//		}
//			//코멘트 내용을 입력받을건데, 내용이 "ㅎㅇ"이면 반복문 끝!
		Scanner input = new Scanner(System.in);
		System.out.println("코멘트 내용을 입력해주세요 :");
		String comment = input.next();//이거 null로 두면된다
		while (true) {
			if (comment.equals("ㅎㅇ")) {
				System.out.println("끝!");
				break; //없으면 무한반복이다!
			} else {
				System.out.println("코멘트 내용을 입력해주세요 :");
			    comment = input.next();
			}
		}
	}
}
