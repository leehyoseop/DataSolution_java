
public class LMain2 {
	//게임 시작하면서 룰 설명
	public static void printRule(String[] hand) {
		System.out.println("<<가위 바위 보 게임 시작!>>");
		System.out.println("=======================");
		for (int i = 1; i < hand.length; i++) {
			System.out.printf("%d. %s", i, hand[i]);
		}
		System.out.println("=======================");
	}
	//컴퓨터가 뭐 냈는지
	
	//유저가 뭐 냈는지.	삼항연산자 쓰면 좋다
	//return (userHand>=1 && userHand<=3) ? userHand : getUserHand();
	//배열
	//user 와 com이 낸 값을 빼서 비교한다.
	//몇승 했는지 
	public static void main(String[] args) {
		String[] hand = {"null","가위","바위","보"};
	}	
}