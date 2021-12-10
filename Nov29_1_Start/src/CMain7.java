import java.util.Scanner;
import java.lang.Math;
//BMI

//이름, 키(cm), 몸무게(kg),
//BMI : 몸무게 / (키*키) -> 키 : m단위
//18.5미만이면 저체중
//18.5이상이면 정상
//25이상이면 과체중
//30이상이면 경도비만
//35이상이면 중증도비만
//40이상이면 고도비만
public class CMain7 {
	public static String enterName() {
		System.out.print("이름을 입력하세요 : ");
		return new Scanner(System.in).next();
	}
	public static double enterHeight() {
		System.out.print("키를 입력하세요(cm) : ");
		return new Scanner(System.in).nextDouble();
	}
	public static double enterWeight() {
		System.out.print("몸무게를 입력하세요(kg): ");
		return new Scanner(System.in).nextDouble();
	}
	public static double calBMI(double height, double weight) {
		double result = weight/Math.round((0.01*height*0.01*height));
		//double result = 30; test용
		System.out.printf("BMI 계산 결과 : %.1f\n", result);
		return result;
	}
	public static void chkBMI(double bmi) {
		//String result로 놓고 return result
		//RAM을 덜 쓰려면 변수를 줄이면되고, 하드를 덜쓰려면 코드를 줄이면된다.
		if (bmi>=40) {
			System.out.println("결과:고도비만");
		} else if(bmi>=35) {
			System.out.println("결과:중증도비만");
		} else if(bmi>=30) {
			System.out.println("결과:경도비만");
		} else if(bmi>=25) {
			System.out.println("결과:과체중");
		} else if(bmi>=18.5) {
			System.out.println("결과:정상");
		} else if(bmi<18.5) {
			System.out.println("결과:저체중");
		}
	}
	public static void main(String[] args) {
		String name = enterName();
		double height = enterHeight();
		double weight = enterWeight();
		System.out.printf("이름 : %s | 키 : %.1f | 몸무게 : %.1f\n", name, height, weight);
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chkBMI(calBMI(height, weight));
	}
}