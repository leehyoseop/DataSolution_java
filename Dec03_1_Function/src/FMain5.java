import java.util.Random;

public class FMain5 {
	
	//	B 함수명 / 기능이 대충이라도 보이게, 동사같은 작명
	//			낙타체 or 뱀체
	//	C 파라미터 / 함수를 호출하는 쪽에서(Main 함수)
	//	A 리턴타입 / 해당 함수에서 작업한 결과를 호출한 쪽으로 보낼 때
	//	public static A B ( C ){
	//		내용
	//		return
	//	}
	
	// 현재 날씨를 구하는 함수
	public static String getWeather() {
		//오늘 날씨 맑음
		String weather = "맑음";
		return weather;
	}
	//1.랜덤한 정수를 하나 구하는 함수
	public static int getRandomNum() {
		return new Random().nextInt(30);
	}

	//3.두 정수를 더한 값을 출력하는 함수
	public static int sumNum(int num1, int num2) {
		System.out.println(num1+num2);
		return num1+num2; 
	}
	public static void main(String[] args) {
		//2. 랜덤한 정수 2개 구해서...
		int num1 = getRandomNum();
		System.out.printf("Num1 : %d\n",num1);
		int num2 = getRandomNum();
		System.out.printf("Num2 : %d\n",num2);
		//4. 랜덤한 정수 2개 더한 값을 출력
		System.out.printf("결과 : %d",sumNum(num1, num2));
	}
}