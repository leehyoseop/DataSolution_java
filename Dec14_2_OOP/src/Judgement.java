
public class Judgement {
	int friendPickNumber;
	int myPickNumber;
	String result;
	int count;

	public void start() {
		Friend f = callFriend();
		Me m = callMe();
		f.friendNum = getNumberFromFriend(f);
		compareNumber(f, m);
	}
	
	public Friend callFriend() {
		return new Friend(); 
	}
	public Me callMe() {
		return new Me();
	}
	public int getNumberFromFriend(Friend f) {
		System.out.println("친구가 랜덤으로 숫자를 줍니다!");
		friendPickNumber = f.giveNumberToJudgement();
		System.err.println(friendPickNumber);
		return friendPickNumber;
	}
	public int getNumberFromMe(Me m) {
		//myPickNumber = m.giveNumberToJudgement();
		System.out.println("1-100사이의 숫자를 입력하세요 : ");
		return m.giveNumberToJudgement();
	}
	public void compareNumber(Friend f, Me m) {
		count = 1;
		//이거대신 for(int turn = 1; true ; turn++){
		//			이런식으로 해줘도 된다. 
		//}
		while(true) {
			myPickNumber = getNumberFromMe(m);
			if (f.friendNum>myPickNumber) {
				result = "Up";
				System.out.println(result);
			} else if (f.friendNum<myPickNumber) {
				result = "Down";
				System.out.println(result);
			} else {
				System.out.printf("정답입니다 %d번만에 정답을 맞췄습니다!\n", count);
				break;
			}
			count++;
		}
	}
}