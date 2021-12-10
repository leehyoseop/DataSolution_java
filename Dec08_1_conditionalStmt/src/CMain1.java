import java.util.Random;
import java.util.Scanner;

public class CMain1 {
	public static void main(String[] args) {
	//1~10사이의 랜덤한 숫자
	//5번 출력	
//		Random r = new Random();
//		int x = 0;
//		for (int i = 0; i < 5; i++) {
//			x = r.nextInt(10) + 1;
//			System.out.println(x);
//			if(x == 9) {
//				break;
//			}
//		}
//		//1~10사이의 랜덤한 정수를 출력
//		//9가 나오면 반복문 종료
//		
//		//반복횟수가 명확 - for문 (o)
//		//반복 조건(if문의 반복버전)
//		// while문 : 조건을 먼저 검사해서
//		//조건이 true인 동안 계속 반복해서 수행부분을 시키는
//		//실행부분에서 조건을 false로 만들어서 멈추도록 하거나
//		//break 명령어로 반복문을 종료시킬 수 있다
//		//조건이 맞지 않으면 반복하던 작업을 중지!
//		//무한대로 반복하고 싶을때 while(true)
//		
//		//while : 반복 횟수를 정확히 알 수 없을때
//		//		특별한 조건에서 멈춰야하는 경우에 사용!
//		System.out.println("-----------------------");
//		int y = 0;//여기서 부터 랜덤하게 정수를 받는 것도 괜찮다
//		while (y != 9) {
//			y = r.nextInt(10)+1;
//			System.out.println(y);
//		}
//		
//		int z = r.nextInt(3)+1;
//		while (z!=3) {
//			System.out.println(z);
//			z = r.nextInt(3)+1;
//		}
//		System.out.println("-----------------------");
//		//do-while문 : 실행부터 하고나서 조건을 나중에 검사
//		do {
//			System.out.println(z);
//			z = r.nextInt(3)+1;
//		} while (z!=3);
//		
		//1+2+3+...+10
		
		//1~n번째 까지 더했을때 100이 넘어가면 반복문이 종료되게
		//총 합은 몇인지 / n은 값은 몇인지 
//		int sum = 0;
//		while (sum<=100) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("정수 n을 입력해주세요 : ");
//			int num = input.nextInt();
//			for (int i = 1; i < num; i++) {
//				sum+=i;
//			}
//			System.out.println(sum);
//			sum = 0;
//		}
//		int sum = 0;
//		int i = 0;
//		while (sum<100) {
//			i++;
//			sum+=i;
//		}
//		System.out.println(i);
//		System.out.println(sum);
//		
		//1000이하의 숫자 중에서 가장 큰 15의 배수는?
//		int i = 1;
//		int mul = 1;
//		while (15*i<=1000) {
//			i++;
//			System.out.println(15*i);
//		}
		int num2=1000;
		while (num2%15>0) {
			num2--;
		}
		System.out.println(num2);
	}
}