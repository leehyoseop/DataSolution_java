import java.util.Scanner;

public class FMain6 {
	// 정수 두개를 넣으면, 그 중에 큰 숫자를 출력하는 함수
	public static int bigger(int a, int b) {
		int bigOne1 = (a-b < 0) ? b : a;
		return bigOne1;
	}
	
	//실수 두개를 넣으면, 그 중에 큰 숫자를 구해주는 함수
	public static double bigger(double a, double b) {
		double bigOne2 = (a-b < 0) ? b : a;
		bigOne2 *=1000;
		return bigOne2;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" x 입력 : ");
		//int x = input.nextInt();
		double x = input.nextDouble();
		
		System.out.println(" y 입력 : ");
		//int y = input.nextInt();
		double y = input.nextDouble();
		System.out.println(bigger(x, y));
		int time=(int)bigger(x, y);
		Thread.sleep(time);
	}
}