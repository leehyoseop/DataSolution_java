import java.util.Random;
import java.util.Scanner;

//홀짝 (함수 ver.)

//랜덤에서 컴퓨터가 뽑고
//내가 입력 홀인지 짝인지
//그리고 비교


public class FMain3 {
	
	public static int selectCoin() {
		return new Random().nextInt(10)+1;
	}
	public static String judgeOddEven(int x) {
		return (x%2==0) ? "짝" : "홀";
	}
	public static String myChoice() {
		return new Scanner(System.in).next();
	}
	public static String judgeCorrect(String x, String y) {
		return x.equals(y) ? "맞았습니다" : "틀렸습니다";
	}
	public static void main(String[] args) {
		int coin = selectCoin();
		System.out.printf("컴퓨터가 코인을 무작위로 추출합니다... : <%d>\n", coin);	
		String computer = judgeOddEven(coin);
		System.out.printf("코인의 짝홀을 판단합니다 : <%s>\n", computer);
		System.out.println("선택할 짝|홀을 입력해주세요 : ");
		String user = myChoice();
		//System.out.println(user);
		System.out.println(judgeCorrect(computer, user));
	}
}
