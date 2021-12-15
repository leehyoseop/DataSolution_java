//생성자(Constructor)
//	객체가 만들어질때 뭔가 작업을 해야하는데...
//	->생성자 만들기!
//	리턴이 아예없고, 메소드명이 클래스명과 같은 메소드
//	생성자를 만들지 않으면
//	->자바 컴파일러가 기본 생성자를 만들어버림!
//	생성자를 건드리면...
//	->자바 컴파일러가 기본 생성자를 안만들어줌
//	->시스템이 자동적으로 객체를 만들때가 있는데...
//	->기본 생성자를 씀 -> 에러!

//	객체를 만들때 속성값까지 다 세팅

public class Shoes {
	String name;
	int size;
	int price;
	static String brand = "나이키";
	//기본생성자(Ctrl + Space)
	public Shoes() {
		// TODO Auto-generated constructor stub
		
	}
	//생성자 오버로딩(Ctrl + Space + Shift)
	public Shoes(String name, int size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	public void printInfo() {
		System.out.printf("모델명: %s\n", name);
		System.out.printf("사이즈: %s\n", size);
		System.out.printf("가격: %d원\n", price);
		System.out.printf("브랜드: %s\n", brand);
	}
	public static void printBrandInfo() {
		System.out.println(brand);
		System.out.println("이효섭");
		System.out.println("테헤란로 152");
	}
	public void test(String name) {
		//멤버변수명과 파라미터명이 같은경우
		//this.을 붙이면 무조건 멤버변수
		//안붙이면 가장 가까운것을 가져온다.
		System.out.println(name);
		System.out.println(this.name);
	}
}