import java.util.Scanner;

public class CMain4 {
	
	//switch - case (ex :권한 설정)
	
	//우선 계급을입력받는다
	//이병 입력 -> 눈치, 관등성명, 훈련, 잠
	//일병 입력 -> 관등성명, 훈련, 잠
	//상병 입력 -> 훈련, 잠
	//병장 입력 -> 잠
	
	public static void Soldier(String x) {
		switch (x) {
		case "이병":
			System.out.println("눈치, 관등성명, 훈련, 잠");
			break;
		case "일병":
			System.out.println("관등성명, 훈련, 잠");
			break;
		case "상병":
			System.out.println("훈련, 잠");
			break;
		case "병장":
			System.out.println("잠");
			break;		
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("계급을 입력하세요 : ");
		String soldier = input.next();
		Soldier(soldier);
	}
}