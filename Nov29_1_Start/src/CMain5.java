import java.util.Scanner;

public class CMain5 {
	
	//직업을 입력받아
	//	DBA(상위 데이터베이스 관리자)
	//		전원관리
	//		백업/복구
	//		명령어로 CRUD
	//		서비스 활용
	//	DBP(데이터베이스 프로그래머)
	//		명령어로 CRUD
	//		서비스 활용
	//	DBU(사용자)
	//		서비스 활용
	
	public static String input() {
		return new Scanner(System.in).next();
	}
	
	public static void Database(String x) {
		switch (x) {
		case "DBA":
			System.out.println("전원관리, 백업/복구");
		case "DBP":
			System.out.println("명령어로 CRUD");
		case "DBU":
			System.out.println("서비스 활용");
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("직업을 입력 : ");
		Database(input());
		
	}
}
