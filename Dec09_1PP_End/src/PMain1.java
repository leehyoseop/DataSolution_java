import java.util.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("약수를 찾고싶은 정수 입력(0입력시 종료): ");
			int num = input.nextInt();
			if (num == 0) {
				System.out.println("종료됩니다!");
				break;
			} else {
				for (int i = 1; i <= num; i++) {
					if(num%i == 0) {
						System.out.print(i+",");
					}
				}
				System.out.println();
			}
		}
	}
}