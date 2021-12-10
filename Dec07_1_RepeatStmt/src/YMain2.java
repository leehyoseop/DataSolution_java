import java.util.Scanner;

public class YMain2 {
	
	//정수를 하나 입력받아서 그게 양수면 양 출력/ 0이면 0출력/ 음수면 음 출력;  
	
	public static int getNum() {
		System.out.println("정수 판별을 위해 숫자하나를 입력해주세요 : ");
		return new Scanner(System.in).nextInt();
	}
	public static void f1(int num) {
		if (num>0) {
			System.out.printf("%d는 양!",num);
		} else if (num == 0) {
			System.out.printf("%d는 0!",num);
		} else {
			System.out.printf("%d는 음!",num);
		}
	}
	public static String f2(int num) {
		String result = "판정값";
		if (num%3 == 0 && num%4 != 0) {
			result = "3의배수";
			return result;
			//return "3의 배수"
		} else if (num%4 == 0 && num%3 == 0) {
			result = "4의배수";
			return result;
		} else {
			result = "몰라!";
			return result;
		}
	}
	public static void main(String[] args) {
		f1(getNum());
	}
}