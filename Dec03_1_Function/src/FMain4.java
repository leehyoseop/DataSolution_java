import java.util.Random;
import java.util.Scanner;

//동전 맞추기 게임

//동전을 10개만 가지고 한다

//동전 개수 맞추면 정답

public class FMain4 {
	
	public static int beginCoin() {
		//Random r = new Random();
		return new Random().nextInt(10)+1;
	}
	public static int userChoice() {
		return new Scanner(System.in).nextInt();
	}
	public static String Answer(int x, int y) {
		System.out.printf("컴퓨터 : %d| 참가자 : %d\n", x,y);
		return (x == y) ? "정답입니다" : "정답이 아닙니다";
	}
	public static void main(String[] args) {
		System.out.println("게임시작!\n"
				+ "1~10 중에서 동전 개수를 입력해주세요 : ");
		System.out.println(Answer(beginCoin(), userChoice()));
	}
}