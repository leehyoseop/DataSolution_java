import java.util.Scanner;

public class FMain5 {
	//게임을 하고 있는데 엄마가 심부름을 시켜요.
	
	//라면이랑 참치 사고 남은 돈 가져오기
	
	//돈을 입력 받아서 함수를 완성해 보기
	
	//심부름 중에...(라면 : 3200 , 참치 : 2170 , 과자 : 1500)
	//돈이 얼마가 남는지.. 생각을...
	
	
	//계산하고 남은 돈을 엄마한테 주자...
	
	public static void momTellme() {
		System.out.println("아들 라면이랑 참치 사고 남은 돈 가져와!");
	}
	
	public static int takeMoney() {
		System.out.println("엄마가 준 돈 : ");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		
		System.out.printf("엄마가 준 돈은 %d원!!!",money);
		
		return money;
		//정수(int)에 대한 값을 main함수에 return, 반환할거니깐 return 타입을 int로 선택!
	}
	
	public static int calculateMoney(int a) {
		int remainMoney = (a - 3200 - 2170 - 1500);
		System.out.printf("\n라면,참치,과자를 사고 남은 돈은 : %d",remainMoney);
		
		return remainMoney;
	}
	
	public static int backMoneyMom(int momMoney) {
		return momMoney;
	}
	
	
	public static void main(String[] args) {
		momTellme();
		int money = takeMoney();
		//System.out.println(money);
		//calculateMoney(money);
		int payback = calculateMoney(money);
		System.out.printf("\n엄마 심부름하고 남은 돈 %d원 가져왔어요", backMoneyMom(payback));
		
		
	}
	//함수를 표현하는 4가지 방식!
	//main에 소스를 최대한 짧게 구성하기 위해서
	//기능들을 묶어서 함수라는 걸로 사용!
	//기능을 나눠서 효율적으로 사용!
}