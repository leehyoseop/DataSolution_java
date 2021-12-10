import java.util.Scanner;

public class PMain2 {
	
	static int studentNum = 0;
	static int[] studentScoreArr = null;
	
	public static int chooseNum() {
		Scanner input = new Scanner(System.in);
		System.err.println("1:학생 수 값을 입력\n2:학생들의 점수를 입력\n3:학생들의 점수리스트 출력\n"
				+ "4:최고점수와 평균점수 출력\n5:프로그램 종료");
		int choice = input.nextInt();
		return choice;
	}
	public static void enterStudentNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 : ");
		studentNum = input.nextInt(); 
	}
	public static int onlyscore() {
		Scanner input = new Scanner(System.in);
		System.out.printf("점수 입력:\n");
		return new Scanner(System.in).nextInt();
		//return (score>=0 && score<=100 ? score : getScore())
	}
	public static void enterStudentScore() {
		Scanner input = new Scanner(System.in);
		studentScoreArr = new int[studentNum];
		int score = 0;
		for (int i = 0; i < studentScoreArr.length; i++) {
			System.out.printf("%d번째 학생 ", i+1); 
			score = onlyscore();
			studentScoreArr[i] = score;
			while(score<0 || score>100) {
				System.out.println("점수는 0-100점이어야합니다. 다시 입력해주세요");
				System.out.printf("%d번째 학생 ", i+1);
				score = onlyscore();
				if (score>=0 && score<=100) {
					studentScoreArr[i] = score;
					break;
				}
			}
		}
	}
	public static void showStudentScore() {
		System.out.println("<학생들의 점수 리스트>");
		for (int i : studentScoreArr) {
			System.out.print(i+" ");
		}
	}
	public static void maxScoreandAverageScore() {
		int sumScore = 0;
		int maxScore = studentScoreArr[0];
		for (int i = 0; i < studentScoreArr.length; i++) {
			sumScore += studentScoreArr[i];
		}
		double averageScore = (double) sumScore / studentNum;
		for (int i = 0; i < studentScoreArr.length; i++) {
			if(studentScoreArr[i]>maxScore) {
				maxScore = studentScoreArr[i];
				//삼항연산자도 사용가능
			}
		}
		System.out.printf("[최고점수 : %d | 평균점수 : %.1f]\n", maxScore, averageScore);
	}
	public static void finish() {
		System.out.println("<프로그램이 종료됩니다>");
	}
	public static void studentProgram() {
		//여기서 배열 선언 
		student:while(true) {
			int user_choice = chooseNum();
			switch (user_choice) {
			case 1:
				enterStudentNum();
				break;
			case 2:
				enterStudentScore();
				break;
			case 3:
				showStudentScore();
				break;
			case 4:
				maxScoreandAverageScore();
				break;
			case 5:
				finish();
				break student;
			}
		}
	}
	public static void main(String[] args) {
		studentProgram();
	}
}
