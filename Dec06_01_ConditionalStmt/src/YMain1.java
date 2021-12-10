import java.util.Scanner;

public class YMain1 {
	//3보다 작은 정수를 입력받는 함수
	//3보다 클때 -> 다시 입력받을 수 있도록!
	public static int inputOverThree() {
		Scanner enter  = new Scanner(System.in);
		System.out.println("3보다 크면 다시 입력 : ");
		int num = enter.nextInt();
		int result = (num<3) ? num : inputOverThree(); 
		return result;
		//return (num<3) ? num : inputOverThree(); 이렇게도 줄이는 것도 좋다
	}
	
	//홀수만 입력받을 수 있는 함수
	public static int OnlyOddnum() {
		Scanner input = new Scanner(System.in);
		System.out.println("홀수만 입력! 짝수 입력하면 다시! :");
		int num = input.nextInt();
		return (num%2 == 0) ? OnlyOddnum() : num;
	}
	
	//정수를 입력받는 함수 => 0~100
	public static int getZerotoHundred() {
		Scanner input = new Scanner(System.in);
		System.out.println("0~100 사이 값을 입력하세요! :");
		int num = input.nextInt();
		return (num>=0 && num<=100) ? num : getZerotoHundred();
	}
	
	public static void main(String[] args) {
		//inputOverThree();
		//OnlyOddnum();
		getZerotoHundred();
	}
}