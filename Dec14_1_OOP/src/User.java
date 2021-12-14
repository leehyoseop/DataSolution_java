import java.util.Scanner;

//멤버 변수 : 속성 (소개할때 언급할만한 것)
//지역 변수 : 그 행동을 하는 동안만 의미있는것
//파라미터 : 그 행동을 하는데 필요한 재료
//리턴 : 그 행동의 결과물
public class User {
	Scanner useranswer = new Scanner(System.in);
	
	public int selectcoin() {
		int userpickcoin = useranswer.nextInt();
		if (userpickcoin<1 || userpickcoin>20) {
			System.out.println("코인의 개수는 1-20사이입니다. 다시입력해주세요! :");
		}
		return (userpickcoin>=1 && userpickcoin<=20) ? userpickcoin : selectcoin();
	}
	
	public String selectOddEven() {
		return useranswer.next();
	}
}
 