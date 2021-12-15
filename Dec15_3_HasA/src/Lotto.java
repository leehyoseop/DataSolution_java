import java.util.Random;

public class Lotto {
	public static void getNumberFromComputer() {
		int comArray[] = {0,0,0,0,0,0};
		//int realcomArray[] = {0,0,0,0,0};
		int compareVal = 0;
		Random r = new Random();
		int count = 0;
		for (int i = 0; i < comArray.length; i++) {
			comArray[i] = r.nextInt(10)+1;
			for (int j = 0; j <= i; j++) {
				if(comArray[i] == comArray[j]) {
					comArray[i] = r.nextInt(10)+1;
					
				}
			}
		}
		
//		a:while (true) {
//			//System.out.println(compareVal);
//			for (int i = 0; i < comArray.length; i++) {
//				compareVal = r.nextInt(10)+1;
//				if (compareVal == comArray[i]) {
//					//compareVal = r.nextInt(10)+1;
//					i=0;
//				}
//				else {
//					count++;
//					//System.out.println(count);
//					comArray[i] = compareVal;
//					if (count == 6) {
//						break a;
//					}
//				}
//			}
//		}
		for (int i : comArray) {
			System.out.println(i);
		}
		
	}
	public static void getNumberFromUser() {
		
	}
	public static void CompareValue() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		getNumberFromComputer();
	}
}
