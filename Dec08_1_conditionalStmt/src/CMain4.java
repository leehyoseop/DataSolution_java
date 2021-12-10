import java.util.Scanner;

public class CMain4 {
	//ATM기능을 하는 프로그램
	//1을 고르면 예금
	//2를 고르면 출금
	//3을 고르면 잔고확인
	static int account = 0;//전역변수<잔고>
	
	public static void show() {
		System.out.println("ATM 1예금|2출금|3잔고확인|4종료 중 선택해주세요 : ");
	}
	public static int getInput() {
		return new Scanner(System.in).nextInt();
	}
	public static void ATM(int num) {
		Scanner input = new Scanner(System.in);
		int money= 0;
		if (num == 1) {
			System.out.println("예금하실 금액을 입력해주세요 : ");
			money = input.nextInt();
			account += money;
		} else if (num == 2) {
			System.out.println("출금하실 금액을 입력해주세요 : ");
			money = input.nextInt();
			account -= money;
		} else if (num == 3) {
			System.err.printf("잔고 : %d\n", account);	
		}
	}
	public static void main(String[] args) {
		while (true) {
			show();
			int num = getInput();
			if (num == 4) {
				System.out.println("종료됩니다!");
				break;
			} else {
				ATM(num);
			}
		}
	}
}