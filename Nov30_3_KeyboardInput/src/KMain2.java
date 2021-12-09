import java.util.Scanner;
import java.lang.Math;

public class KMain2 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*****원의 반지름을 입력받아 면적계산하기*****");
		System.out.print("원의 반지름을 입력하세요 : ");
		double var = keyboard.nextDouble();
		
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println("계산중입니다.");
		Thread.sleep(1000);
		
		System.out.printf("면적 : %.2f", Math.PI * Math.pow(var, 2));
		Thread.sleep(10000);
		
	}
}