//PP: 절차지향프로그래밍
	//-> 고급진 내용들을 좀 다뤄볼까...
	//연산자
	//shift연산자...
	//3>>1 : 6
	//앞의 숫자를 2진수로 바꿔서 : 11
	//왼쪽으로 뒤의 숫자만큼 밀고, 빈칸에는 0 채워넣기 : 110
	//이진수(110)을 다시 십진수로 : 6
public class PMain2 {
	public static void name() {
		
	}
	public static void main(String[] args) {
		int button1 = 30;
		String[] option = {"24시간", "주차장", "Wifi", "흡연실"};
		for (int i = option.length-1; i >= 0; i--) {
			if(button1>=(1<<i)) {
				System.out.println(option[i]);
				button1-=(1<<i);
			}
		}
		if(button1>=(1<<2)) {
			System.out.println("WIFI");
		}
	}
}
