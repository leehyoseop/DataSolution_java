import java.util.Random;

public class Computer {
	int playcoin;
	int afterShakeCoin;
	Random comShakeCoin = new Random();
	String userAnswer;
	String OddEven;
	public void start() {
		User u = callUser();
		askUser(u);
		judgeResult(shakeCoin(), chooseAnswer(u));
	}
	private User callUser() {
		return new User();
	}
	public void askUser(User u) {
		System.out.println("20개 중에서 몇개로 시작할까요? :");
		this.playcoin = u.selectcoin();
		//System.out.println(this.playcoin);
	}
	public String shakeCoin() {
		//System.out.println(this.playcoin);
		this.afterShakeCoin = comShakeCoin.nextInt(this.playcoin)+1;
		System.out.println("=====");
		System.out.println(this.afterShakeCoin);
		System.out.println("=====");
		if (this.afterShakeCoin%2 == 0) {
			OddEven = "짝";
		} else {
			OddEven = "홀";
		}
		return OddEven;
	}
	public String chooseAnswer(User u) {
		System.out.println("다 섞었습니다! 홀/짝중 하나를 골라주세요! :");
		this.userAnswer = u.selectOddEven();
		return this.userAnswer;
	}
	public void judgeResult(String com, String user) {
		if (com.equals(user)) {
			System.out.println("정답입니다!");
		}else {
			System.out.println("틀렸습니다!");
		}
		//if else만 있으면 삼항연산자!
	}

}