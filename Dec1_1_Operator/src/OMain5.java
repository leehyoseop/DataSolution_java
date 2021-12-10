import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class OMain5 {
	public static void main(String[] args) throws InterruptedException {
		//키 몸무게를 입력받아서 -> 비만도 검사 프로그램
		
		//표준체중 = (키-100) * 0.9
		//비만도 = (실제 체중 / 표준 체중) * 100
		//비만도가 120이 넘으면 비만, 아니면 안비만
		
		Scanner input = new  Scanner(System.in);
		
		System.out.println("키를 입력해주세요! : ");
		double height = input.nextDouble();
		System.out.println("몸무게를 입력해주세요! : ");
		double weight = input.nextDouble();
		
		double standardWeight = (height - 100) * 0.9;
		
		double BMI = (weight/standardWeight) * 100;
		
		System.out.println(BMI);
		
		String result = (BMI>120) ? "비만" : "안비만";
		//System.out.println(result);
		
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		
		System.out.printf("당신은 %s입니다\n", result);
		
		System.out.print("아무거나 입력하세요 : ");
		String bye = input.next();
		input.close();
	}
}
