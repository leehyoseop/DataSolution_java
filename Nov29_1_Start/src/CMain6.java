import java.util.Scanner;

public class CMain6 {
	//1년 =12달
	//각 달마다 몇일인지 다릅니다
	//몇월인지 입력을 받아서
	//1 3 5 7 8 10 12
	// 2 4 6 9 11
	public static int input() {
		return new Scanner(System.in).nextInt();
	}
	
	public static void MonthandDay(int month) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("31일까지 있습니다");
			break;
		case 2:
			System.out.println("28일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있습니다");
			break;
		default:
			System.out.println("없는 달입니다.");
			break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("일을 구하고싶은 달을 입력하세요 : ");
		MonthandDay(input());
	}
}
