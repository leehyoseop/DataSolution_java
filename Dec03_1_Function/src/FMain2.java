import java.util.Scanner;

//비만도 검사 프로그램

//키, 몸무게는 입력받을것
//표준체중 = (키-100)*0.9
//비만도 = (실제체중/표준체중) * 100
//비만도가 120이 넘으면 '비만', '안비만'

//ctrl + shift + /(numpad) : 함수 닫기
//ctrl + shift + *(numpad) : 함수 열기

public class FMain2 {
	public static double enterheight() {
		//Scanner input = new Scanner(System.in);
		System.out.println("키를 입력하세요 : ");
		//double height = input.nextDouble();
		return new Scanner(System.in).nextDouble();
	}
	public static double enterweight() {
		//Scanner input = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요 : ");
		//double weight = input.nextDouble();
		//System.out.printf("--->몸무게 : %.1f\n", weight);
		return new Scanner(System.in).nextDouble();
	}
	public static double StandardWeightcalculate(double x) {	
		//double standardweight = (x-100)*0.9;
		//System.out.printf("표준체중 : %.1f \n", standardweight);
		return (x-100)*0.9;
	}
	public static double Fatcalculate(double x, double y) {
		double Fat = (y/x) *100;
		System.out.printf("Fat : %.1f\n", Fat);
		return Fat;
	}
	public static void checkBMI(double x) {
		String result = (x>120) ? "<<비만>>" : "<<안비만>>";
		System.out.println(result);
	}
	public static void main(String[] args) {
		checkBMI(Fatcalculate(StandardWeightcalculate(enterheight()), enterweight()));
	}
}