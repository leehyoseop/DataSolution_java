import java.util.Scanner;

public class FMain1_1 {
	
	public static void selfIntro() {
		System.out.println("이름은 이효섭");
		System.out.println("핸드폰번호는 01046779529");
		System.out.println("경기도 일산");
	}
	//파라미터(parameter) : 함수를 실행하는데 필요한 재료
	public static void cal(int x, int y) {
		int plus = x+y;
		int minus = x-y;
		int multiply = x*y;
		double divide = (double) x/y;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
	}
	
	/*
	public static void calculate() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 a 를 입력해 주세요!");
		int a = input.nextInt();
		System.out.println("정수 b 를 입력해 주세요!");
		int b = input.nextInt();
		
		double remainder = (double) a/b;
		
		System.out.printf("덧셈 결과 : %d | 뺄셈 결과 : %d | 곱셈 결과 : %d | 나눗셈 결과 : %.1f", a+b, a-b, a*b, remainder);
	
	}
	*/
	public static void main(String[] args) {
		//selfIntro();
		cal(10,20);
	}
}
