import java.util.Scanner;

//Part 1 : 절차지향 프로그래밍(순서대로 잘 써서 결과를 잘 내자!) - 이과스럽다.
//Part 2 : 객체지향 프로그래밍 - 문과스럽다 
//Part 3 : 기타 등등  외부 라이브러리

//조건문, 반복문, 배열 -----> 정보올림피아드 문제
//Part 2 : 객체, 라이브러리,                                                                                       
public class CMain3 {
	//A : while 이렇게 반복문에 이름을 붙이고, break A;이런식으로 종료시켜준다.
	//
	public static void show() {
		System.out.println("직업을 입력해주세요 : ");
	}
	public static String getInput() {
		return new Scanner(System.in).next();
	}
	public static void chkJob(String job) {
		if (job.equals("매니저")) {
			System.out.println("<시스템관리.학생관리.수업관련업무>");
		} else if (job.equals("강사")) {
			System.out.println("<학생관리.수업관련업무>");
		} else if (job.equals("학생")) {
			System.out.println("<수업관련업무>");
		}
	}
	public static void main(String[] args) {
		//System.out.printf("%s",chkJob(getInput()));
		while(true) {
			show();
			String input = getInput();
			if (input.equals("끝")) {
				System.out.println("종료됩니다!");
				break;
			} else {
				chkJob(input);
			}
		}
	}
}