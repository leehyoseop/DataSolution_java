import java.util.Scanner;

public class KMain3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*
		System.out.println("*****가로 세로 입력 받아서 사각형면적 계산하기*****");
		
		System.out.print("가로입력 : ");
		double a = keyboard.nextDouble();
		System.out.print("세로입력 : ");
		double b = keyboard.nextDouble();
		
		System.out.printf("사각형 면적 : %.2f", a*b);
		*/
		
		System.out.println("*****시간(초) 입력받아서 분, 시간단위로 변환*****");
		
		
		System.out.print("시간(초) 입력 : ");
		double a = keyboard.nextDouble();
		
		System.out.printf("%.1f분 /"
				+ "%.1f시간", a/60, a/60/60);
		
		//int / int = int
		// - > 형변환을 해주어야한다.
		
	}
}
