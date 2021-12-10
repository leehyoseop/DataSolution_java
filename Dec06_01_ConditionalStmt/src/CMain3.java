import java.util.Scanner;

public class CMain3 {	
	public static void name() {
	}
	
	public static void main(String[] args) {
		//정수하나 입력받을 수 있게
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int x = input.nextInt();
		//조건문 : if, switch 
		//switch-case ('sw' + 자동완성)
		//switch문: 비교조건이 특정한 값이나 문자열인 경우
		//break를 사용해서 각조건이 만족하면 switch문이 깨지도록
		
		//switch (변수 or 식) {
		//case 값 A:
		//	변수 or 식의 값이 A일때 이 부분이 실행된다.
		//	break;
		//case 값 B:
		//	변수 or 식의 값이 B일때 이 부분이 실행된다.
		//	break;
		//default:
		//	A값도 아니고, B값도 아닐때 이부분이 실행.
		//	break;
		//}
		switch (x) {
		case 1:
			System.out.println("ㅋ");
			break;
		case 2:
			System.out.println("ㅎ");
			break;
		case 3:
			System.out.println("ㅠㅠ");
			break;
		default:
			System.out.println("졸려.....");
			break;
		}
	}
}