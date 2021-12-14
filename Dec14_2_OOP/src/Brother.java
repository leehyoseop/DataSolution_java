import java.util.Random;
import java.util.Scanner;

public class Brother {
	//Random hand = new Random();
	Scanner hand = new Scanner(System.in);
	int brotherpick;
	public int giveBrotherPick() {
		brotherpick = hand.nextInt();
		return brotherpick;
	}
}
