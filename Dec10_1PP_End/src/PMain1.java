import java.util.Scanner;

//main함수에서 진행
//1을 입력하면 학생 수 값을 입력받을 수 있는 기능
//2를 입력하면 각 학생들의 점수를 입력 받을 수 있게 

public class PMain1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int studentNum = 0;
		int maxScore = 0;
		int sumScore = 0;
		double averageScore = 0;
		int[] studentNumArray = null;
		int[] studentScoreArray = null;
		
		student:while(true) {
			System.err.println("1:학생 수 값을 입력\n2:학생들의 점수를 입력\n3:학생들의 점수리스트 출력\n"
					+ "4:최고점수와 평균점수 출력\n5:프로그램 종료");
			System.err.println("===번호를 선택해주세요 : ====");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("학생 수를 입력해주세요:");
				studentNum = input.nextInt();
				studentNumArray = new int[studentNum];
				break;
			case 2:
				studentScoreArray = new int[studentNum];
				for (int i = 0; i < studentNumArray.length; i++) {
					System.out.printf("학생 %d의 점수를 입력해주세요: \n", i+1);
					int studentScore =input.nextInt(); 
					studentScoreArray[i] = studentScore;
					//그냥 바로 input으로 받는것도 좋다
				}
				break;
			case 3:
				System.out.println("학생들의 점수 리스트");
				for (int i : studentScoreArray) {
					System.out.print("["+ i +"]");
				}
				break;
			case 4:
				maxScore = studentScoreArray[0];
				for (int i = 0; i < studentScoreArray.length; i++) {
					sumScore += studentScoreArray[i];
				}
				averageScore = (double) sumScore / studentNum;
				for (int i = 0; i < studentScoreArray.length; i++) {
					if(studentScoreArray[i]>maxScore) {
						maxScore = studentScoreArray[i];
						//삼항연산자도 사용가능
					}
				}
				System.out.printf("[최고점수 : %d | 평균점수 : %.1f]\n", maxScore, averageScore);
				break;
			case 5:
				System.out.println("프로그램이 종료됩니다");
				break student;
			}
		}
	}
}
