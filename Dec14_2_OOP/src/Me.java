import java.util.Scanner;

public class Me {
	int numberToJudgement;
	Scanner number = new Scanner(System.in); 
	
	public int giveNumberToJudgement() {
		numberToJudgement = number.nextInt();
		if (numberToJudgement<1 || numberToJudgement>100) {
			System.out.println(">숫자는 1부터 100사이에서 다시 입력하세요 :");
		}
		return (numberToJudgement>=1 && numberToJudgement<=100) ? numberToJudgement :  giveNumberToJudgement();
	}
}
