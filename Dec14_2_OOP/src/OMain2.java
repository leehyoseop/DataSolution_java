//가위바위보
//	1.등장인물 : 심판 / 누나 / 나
//	2.각 개체들 속성 ? 행동 ?
//	3.내가 한판 질동안 몇승/몇무 했는지
public class OMain2 {
	
	public static void main(String[] args) {
		Referee r = new Referee();
		Sister s = new Sister();
		Brother b = new Brother();
		r.start(s,b);		
	}
}
