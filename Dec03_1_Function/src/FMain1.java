import java.util.Random;
import java.util.Scanner;

//오늘도 함수 !

public class FMain1 {
	
	//랜덤한 정수를 출력하는 함수!
	//Random r = new Random();
	//int coin = r.nextInt(10) + 1; // 0~4 -> 1~5
	
	public static void printRandom() {
		Random r = new Random();//랜덤한 정수 뽑을 준비!
		int num = r.nextInt();
		System.out.println(num);
	}
	
	//랜덤한 정수를 생성하는 함수!
	public static int createRandom() {
		Random r1 = new Random();//랜덤한 정수 뽑을 준비!
		int num1 = r1.nextInt(10)+1;
		return num1;
	}
	
	//정수를 하나 넣으면 홀수인지 짝수인지 출력하는 함수
	public static void oddeven(int a) {
		String result = (a%2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}
	
	//정수를 두개 넣었을때 앞숫자가 크면 '앞', 뒷숫자가 크거나 같으면 '뒤'생성
	public static String classify(int a, int b) {
		String result1 = (a>b) ? "된장찌개" : "제육볶음";
		return result1;
	}	
	
	//JVM -> main함수를 자동으로 호출	
	public static void main(String[] args) {
		//printRandom();//1
		
		//System.out.println(createRandom());//2
	
		//oddeven(15);//3
		
		//System.out.println(classify(5, 10));//4
		
		//점심메뉴 (2가지 중 하나)
		//위의 함수를 이용해서... 
		
		//int x = createRandom();
		//System.out.println(x);
		//int y = createRandom();
		//System.out.println(y);
		System.out.println(classify(createRandom(), createRandom()));
		
	}
}
