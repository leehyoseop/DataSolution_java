import java.util.Scanner;

public class CMain1 {
	public static void main(String[] args) {
		// 변수
		// (자료형 변수명 = 값;)
		//  = (대입연산자)
		//  A = B
		// 우항에 있는 것을 좌항에 넣어라.
		// 변수에 값을 넣을 때 사용
		
		//사칙연산 (Scanner + 출력)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("x 값 입력! :");
		int x = input.nextInt();
		System.out.println("y 값 입력! :");
		int y = input.nextInt();
		
		//변수 만들어서 하는 것도 괜찮다!
		
		double plus = x+y;
		double minus = x-y;
		double multiply = x*y;
		double divide = x/y;
		
		/*
		System.out.printf("덧셈 연산 : %.1f + %.1f = %.1f\n", x, y, x+y);
		System.out.printf("뺄셈 연산 : %.1f - %.1f = %.1f\n", x, y, x-y);
		System.out.printf("곱셈 연산 : %.1f * %.1f = %.1f\n", x, y, x*y);
		
		System.out.printf("나눗셈 연산 : %.1f / %.1f = %.1f\n"
				+ "나머지 값 출력 : %.1f", x, y, x/y, x%y);
		*/
		//나머지까지 출력하는 방법
		//int / int = int(java한정)
		//double / int = double
		//int / double = double
		//double / double = double
		
		//형변환
		//double 변수명 = (double) 연산 => 이걸 통해서 형변환을 해준다.
		
		//int remainder = x % y //나머지를 받는 것.
		
		//다시 리마인드!
		//x = 10, y = 4
		//A = B는 같다는 의미가 아니라, A에 B를 넣어라 라는 의미
		//System.out.printf("x는 %.1f\n",x);//10.0
		//System.out.printf("y는 %.1f\n",y);//4.0
		//x = y;
		//System.out.printf("x는 %.1f\n",x);//4.0
		//System.out.printf("x는 %.1f\n",y);//4.0
		// 대입연산자 활용
		//한글자라도 덜치면 좋잖아!
		x += 1;//x=x+1;
		System.out.println(x);
		x -= 1;//x=x-1;
		System.out.println(x);
		x*=3;//x=x*3;
		System.out.println(x);
		x/=2;//x=x/2;
		System.out.println(x);
		x%=2;//x=x%2;
		System.out.println(x);
		
		System.out.println("더 간단하게 만들기(덧셈과 뺄셈만 있다!!!)");
		x++;//x = x+1;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		//x**;이건 없다!!!!!
		
	}
}
