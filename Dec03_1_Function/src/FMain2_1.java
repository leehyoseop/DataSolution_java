import java.util.Scanner;

public class FMain2_1 {
	
	public static double[] yes() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		double height = input.nextDouble();
		System.out.printf("--->키 : %.1f\n", height);
		
		System.out.println("몸무게를 입력하세요 : ");
		double weight = input.nextDouble();
		System.out.printf("--->몸무게 : %.1f\n", weight);
		
		return new double[] {height, weight};
	}
	
	public static void main(String[] args) {
		//double result[] = yes();
		System.out.println(yes()[0]);
		
	}
}
