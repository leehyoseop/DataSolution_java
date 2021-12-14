
public class Referee {
	int sisterHand;
	int brotherHand;
	int win;
	int draw;
	
	public void start(Sister s, Brother b) {
		System.out.println("<누나랑 동생이 가위바위보를 시작합니다!>");
		RockSissorPaper(s, b);
	}
	
	public int getSisterHand(Sister s) {
		//sisterHand = s.giveSisterPick();
		System.out.println("누나가 임의로 가위바위보중 하나를 냅니다!");
		return s.giveSisterPick();
	}
	public int getBrotherHand(Brother b) {
		//brotherHand = b.giveBrotherPick();
		System.out.println("동생이 낼 차례입니다! 가위:1 바위:2 보:3 입력해주세요 ->");
		return b.giveBrotherPick();
	}
	private void RockSissorPaper(Sister s, Brother b) {
		win = 0;
		draw = 0;
		while(true) {
			sisterHand = getSisterHand(s);
			System.err.println(sisterHand);
			brotherHand = getBrotherHand(b);
			System.err.println(brotherHand);
			if((brotherHand - sisterHand) == -1 || (brotherHand - sisterHand) == 2) {
				System.out.printf("동생이 패배하였습니다. 동생은 %d승 %d무를 기록했습니다", win, draw);
				break;
			} else if ((brotherHand - sisterHand) == 0) {
				System.out.println("동생과 누나가 무승부입니다");
				draw++;
			} else {
				System.out.println("동생이 승리했습니다");
				win++;
			}
		}
	}
}