import java.util.Iterator;
import java.util.Random;

//여태까지 했던 것 - 문과적 요소...!

//반복문 - 이과적 요소...! -> 어려워요

public class RMain1 {
//	1. 어떤 작업을 53번 반복(횟수)	
//	for(변수초기화; 조건식; 값의 증감) { //(1. 변수 초기화 맞고) (2. 조건식이 맞으면(참)) (3. 내용 출력)
//									(4. 값의 증감) (5. 다시 조건 비교) (6. 내용 출력) (7. 값의 증감) (8. 다시 조건 비교)
//									(9. 내용 출력) (10. 조건비교후 안맞으면 거짓)
//	
//	}
//	2.작업 - 점심시간까지 반복(기한)
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.printf("[%d | ㅋ]\n", i);
		}
		for (int i = 0; i < 11; i++) {//i++말고 i+=2도 가능하다
			System.out.printf("%d \n", 2*i+1);
		}
		for (int i = 5; i >= 1 ; i--) {
			System.out.printf("%d\n", i);
		}
		System.out.println("------------------------");
		//반복문이 5번 도는 동안에 1~10사이의 숫자를 랜덤하게 뽑고싶을때
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int result = r.nextInt(10)+1;
			System.out.println(result);
		}
		//반복문 속에서 변수를 만드는 것은 별로인 방법이다.
		//반복문 밖에서 변수 하나 만들어서 갖다쓰는게 조금 더 효율적이다!
		//int r3 = 0;
		//for (int i = 0; i < args.length; i++) {
		//	r3 = r.nextInt(10) + 1; //변수의 값만 변경 / 생성을 한것은 아니다
		//}
		System.out.println("------------------------");
		//등차수열 만들기 1+2+3+...+10
		int x = 0;
		for (int i = 1; i < 11; i++) {
			x+=i;
		}
		System.out.println(x);
		System.out.println("------------------------");
		//팩토리얼 만들기!
		int fact = 1;
		for (int i = 1; i < 8; i++) {
			fact *= i;
		}
		System.out.println(fact);
		System.out.println("------------------------");
		//1에서 50까지 수 중에
		int sum = 0; 
		for (int i = 1; i <=50; i++) {
			if (i%3 == 0 && i%5 == 0) {
				sum+=i;
			} else if (i%3 == 0){
				sum+=i;
			} else if (i%5 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		int sum2 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum2+=i;
			}
		}
		System.out.println(sum2);
		System.out.println("------------------------");
	}
}