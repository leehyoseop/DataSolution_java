import java.util.Scanner;
//재귀적 함수 호출
//함수속에서 자기 자신을 또 호출
public class FMain6 {
	
	//등차수열
	//정수를 하나 넣으면
	//1+2+3+4+....+그 숫자까지
	//다 더한 값을 구해주는 함수
	public static int inputNum() {
		return new Scanner(System.in).nextInt();
	}
	public static int add(int num) {
		int answer = (num==1) ? 1 :(num + add(num-1));
		return answer;	
	}
	//정수를 하나 넣으면 팩토리얼 값을 구하는 함수
	public static int factorial(int x) {
		int answer = (x == 1) ? 1 : x*factorial(x-1);
		return answer;
	}
	//피보나치
	public static int fibonacci(int num) {
		int answer = (num==1 || num==2) ? 1 : fibonacci(num-1) + fibonacci(num-2);
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(factorial(4));
		System.out.println(fibonacci(6));
	}
}