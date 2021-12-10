
public class FMain4_1 {
	
	public static void print(int a) {
		System.out.println("윽!");
	}
	public static void print(String a) {
		System.out.println("악!");
	}
	public static void print(double a) {
		System.out.println("으아아악!");
	}
	public static void print() {
		System.out.println("졸리다...");
	}
	
	
	
	
	public static void main(String[] args) {
		print(4);
		print("사 이");
		print(4.4);
		print();
		//오버로딩..을 알아봤는데..
		//사실 우리는 첫날부터 이 오버로딩을 사용하고 있었다!
		System.out.println(); // ====> 이것도 오버로딩의 종류이다~! 이걸로 함수명을 하나로 통일했다!
		
	}
}
