import java.util.Random;
import java.util.Scanner;

//가위바위보 게임
//함수 사용
//1.가위/2.바위/3.보 -> 콘솔창에 숫자로 입력
//컴퓨터와 가위바위보를 해서 1번질동안에 몇승하는지 출력할수 있게

public class LMain1 {
	
	public static int userInput() {
		System.out.println("1을 입력하면 가위 | 2를 입력하면 바위 | 3을 입력하면 보 :");
		return new Scanner(System.in).nextInt();
	}
	
	public static int computerInput() {
		System.out.println("컴퓨터가 가위/바위/보 중 하나를 냅니다!");
		return new Random().nextInt(3)+1;
	}
	
	public static void RockSissorPaper() {
		int win = 0;
		while(true) {
			int user = userInput();
			int computer = computerInput();
			System.out.printf("유저: %d 사용자: %d\n", user, computer);
			if (user == 1 && computer == 1) {
				System.out.println("유저[가위] 컴퓨터[가위] > 비겼습니다!");
			} else if (user == 1 && computer == 2) {
				System.out.println("유저[가위] 컴퓨터[바위] > 컴퓨터 승리!");
				break;
			} else if (user == 1 && computer == 3) {
				System.out.println("유저[가위] 컴퓨터[보] > 유저 승리!");
				win++;
			} else if (user == 2 && computer == 1) {
				System.out.println("유저[바위] 컴퓨터[가위] > 유저 승리!");
				win++;
			} else if (user == 2 && computer == 2) {
				System.out.println("유저[바위] 컴퓨터[바위] > 비겼습니다!");
			} else if (user == 2 && computer == 3) {
				System.out.println("유저[바위] 컴퓨터[보] > 컴퓨터 승리!");
				break;
			} else if (user == 3 && computer == 1) {
				System.out.println("유저[보] 컴퓨터[가위] > 컴퓨터 승리!");
				break;
			} else if (user == 3 && computer == 2) {
				System.out.println("유저[보] 컴퓨터[바위] > 유저 승리!");
				win++;
			} else if (user == 3 && computer == 3) {
				System.out.println("유저[보] 컴퓨터[보] > 비겼습니다!");
			}			
		}
		System.out.printf("유저는 1번 지기 전까지 총 %d회 승리하였습니다\n", win);
	}
	public static void main(String[] args) {	
//		System.out.println(userInput());
//		System.out.println(computerInput());
		RockSissorPaper();
	}
}
