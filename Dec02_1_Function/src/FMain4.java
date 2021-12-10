import java.util.Scanner;

public class FMain4 {
	//<오버로딩> ***고급기술!
	//함수명은 같게, 파라미터를 다르게 하는 기술
	//호출할 때 어떤 값을 넣었냐에 따라 함수가 불러지게 하는 기술
	//같은 자료형을 써도, 파라미터의 개수가 다르면 오버로딩이 가능
	//파라미터의 개수가 같아도, 다른 자료형을 사용하면 오버로딩이 가능
	//정수 2개를 넣으면 그 합을 출력해주는 함수
	
	public static void calculate(int a, int b) {
		int sum = a+b;
		System.out.printf("계산 결과 : %d + %d = %d",a,b,sum);
	
	}
	
	public static void calculate(double a, double b) {
		double sum = a+b;
		System.out.printf("계산 결과 : %.1f + %.1f = %.1f",a,b,sum);
	
	}
	
	public static void calculate(double a, double b, double c) {
		double sum = a+b+c;
		System.out.printf("계산 결과 : %.1f + %.1f + %.1f = %.1f",a,b,c,sum);
	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" x 입력 : ");
		//double x = input.nextDouble();
		int x = input.nextInt();
		System.out.println(" y 입력 : ");
		//double y = input.nextDouble();
		int y = input.nextInt();
		System.out.println(" z 입력 : ");
		double z = input.nextDouble();
		
		calculate(x,y);
		
	}
}
