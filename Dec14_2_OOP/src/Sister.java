import java.util.Random;

public class Sister {
	Random hand = new Random();
	int sisterpick;
	public int giveSisterPick() {
		sisterpick = hand.nextInt(3)+1;
		return sisterpick;
	}
}
