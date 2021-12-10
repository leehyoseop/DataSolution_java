
public class FMain2 {
	
	public static void test(int b) { // 파라미터 값으로 불러오고 그 다음 함수안에 있는 내용이 진행되어서 그림상 B가 먼저 스택영역에 쌓이게 된다
		int a = 123;
		System.out.println(b); //30
		System.out.println(a+b); //153
	}
	
	
	
	public static void main(String[] args) {
		int a = 10; //지역변수
		int b = 20; //함수 내에서 만든 변수
		int c = 30;
		test(c);
		System.out.println(b); //20
		
		//같은 공간내에서는 같은 이름의 변수를 못 만든다~
		
	}
}
