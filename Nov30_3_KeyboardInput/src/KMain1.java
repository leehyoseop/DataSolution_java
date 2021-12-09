import java.util.Scanner;

public class KMain1 {
	public static void main(String[] args) throws InterruptedException {
		//Scanner : Java의 내장되어있는 기능 중 하나!
		// 이 기능을 불러오기 위해 Import라는 것이 사용됨
		// 이 Scanner라는 걸 사용하려면 조건이 하나 필요한데...
		//Scanner는 화면(이클립스의 콘솔창)으로부터 데이터를 입력받는 기능
		
		//입력을 준비해서 keyboard라는 변수에 저장
		Scanner keyboard = new Scanner(System.in);
		
		//이름을 콘솔창에 출력할건데...
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		System.out.print("사는 곳 : ");
		String resident = keyboard.next();
		System.out.print("신발 사이즈 : ");
		int shoeSize = keyboard.nextInt();
		System.out.print("좋아하는 식사 : ");
		String goodMeal = keyboard.next();
		System.out.print("식사 유무 : ");
		String full = keyboard.next();
		
		System.out.printf("| 키 : %.1f | 사는 곳 : %s | 신발 사이즈 : %d "
				+ "|좋아하는 식사 : %s |식사 유무 : %s |", height, resident, shoeSize, goodMeal, full);
		
		System.out.print("\n끄고 싶으면 아무거나 입력 : ");
		String quit = keyboard.next();
		keyboard.close();
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		System.out.println("프로그램을 종료합니다");
		Thread.sleep(1000);
	}
}
