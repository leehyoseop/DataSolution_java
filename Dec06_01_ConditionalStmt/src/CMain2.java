import java.util.Scanner;

public class CMain2 {
	//숫자하나를 입력
	//입력받은 정수값이 5보다 크면 새로운 변수 y에 정수 10을 담아서 출력
	//입력받은 정수값이 3보다 크면 새로운 변수 y에 정수 20을 담아서 출력
	public static int getNum() {
		Scanner input = new Scanner(System.in);
		System.out.print("x : ");
		int x = input.nextInt();
		int y = 0;//if문 밖에 변수를 생성하고 if문 안에서 값을 변경할수있게 하는 것이 효율적이다
		if (x>5) {
			y = 10;
		} else if(x>3) {
			y = 20;
		}
		return y;
		/*
		 * else { y = 0; return y; }
		 */
	}
	
	public static void main(String[] args) {
		System.out.println(getNum());
	}
}