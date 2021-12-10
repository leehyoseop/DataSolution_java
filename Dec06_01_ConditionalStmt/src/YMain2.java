import java.util.Scanner;

//정수 2개를 입력받아서 
//더했을때 짝수면 결과 리턴, 아니면 값을 다시 입력
public class YMain2 {
	public static int getNum1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Num1을 입력: ");
		int num1 = input.nextInt();
		return num1;
	}
	public static int getNum2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Num2를 입력: ");
		int num2 = input.nextInt();
		return num2;
	}
	public static int sumNum(int x, int y) {
		System.out.println("더했을 때 짝수면 결과값 출력, 아니면 값을 다시 입력 ...");
		System.out.printf("더한 결과 : %d\n", x+y);
		return  ((x+y)%2==0) ? x+y : sumNum(getNum1(), getNum2()); 
	}
	public static void main(String[] args) {
		System.out.println(sumNum(getNum1(), getNum2()));
	}
}
