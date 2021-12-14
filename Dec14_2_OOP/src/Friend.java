import java.util.Random;

public class Friend {
	Random number = new Random();
	int friendNum;
	
	public int giveNumberToJudgement() {
		return number.nextInt(100)+1; 
	}
}
