import java.util.Scanner;

public class KMain5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("***************학점계산기***************");
		
		System.out.print("이름을 입력하세요 : ");
		String name = input.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		double korean = input.nextDouble();
		System.out.print("영어 점수를 입력하세요 : ");
		double english = input.nextDouble();
		System.out.print("수학 점수를 입력하세요 : ");
		double math = input.nextDouble();
		
		System.out.printf("%s 학생의 시험결과 => "
				+ "총점 : %.1f 평균점수 : %.1f", name, korean+english+math, (korean+english+math)/3);
	}
}
