import java.util.Random;
import java.util.Scanner;

//updown게임(함수 사용O)
//컴퓨터 : 1~100사이의 숫자를 뽑음(ex.34)
//유저가 입력

//컴퓨터가 1~100사이의 숫자를 하나 뽑아주는 함수
//유저가 답을 입력할 수 있는 함수
//한번 입력했을 때 정답인지 아닌지 확인 + 반복문을 깰지 말지가 전달됨(boolean)
//정답 맞출때까지 반복하는 함수
public class PMain4 {
	public static int chooseComputer() {
		Random r = new Random();
		int selectnum  = r.nextInt(100)+1;
		System.out.printf("컴퓨터가 뽑은 숫자: %d\n", selectnum);
		return selectnum;
	}
	public static int userInput() {
		System.out.println("정답을 입력해주세요: ");
		return new Scanner(System.in).nextInt();
	}
	public static void compareValue(int computernum) {
		int userinput = 0;
		while(true) {
			userinput = userInput();
			if (computernum == userinput) {
				System.out.println("정답입니다!\n프로그램이 종료됩니다.");
				break;
			} else if (computernum>userinput) {
				System.out.println("<Up>");
			} else if (computernum<userinput) {
				System.out.println("<Down>");
			}
		}
	}
	//boolean 이 조건에 맞을때 true값을 리턴하고,
	//이 조건에 맞지 않으면 false값을 리턴
	public static void main(String[] args) {
		compareValue(chooseComputer());
	}
}  