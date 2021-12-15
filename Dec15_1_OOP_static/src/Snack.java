//멤버 변수 : 객체의 속성 -> (객체,속성)으로 표현
//			this : 이 객체를 뜻함(생략가능하다)

//이 세상의 모든 과자를 '김비버'가 만든다고 한다면?
// ->이 때 사용하는게 *** 'static' 멤버 변수
//		-객체가 없어도 쓸 수 있는 정보
//			->클래스명.xxx로 사용
//		-객체들의 공통속성을 나타낼 때 사용
//			->객체를 여러개 찍어내도 static 멤버변수는 하나만!
//			->메모리 절약 O

// static final 멤버변수 -> 아예고정 / 수정 불가능 / 상수화
// static final 자료명 변수명 (대문자로/문화) = 내용;
// static을 활용한 method
//		메모리가 절약
//		객체가 없어도사용이 가능
//		static이 아닌 다른 멤버변수에는 접근이 불가능하다

public class Snack {
	String name;
	double gram;
	int price;
	static final String MANUFACTURER = "김비버";
	
	
	//이 과자의 정보를 출력하는 메소드
	public void printInfo() {
		System.out.printf("과자이름: %s\n", name);
		System.out.printf("중량: %.1f\n", gram);
		System.out.printf("가격: %d\n", price);
		System.out.printf("생산자: %s\n", MANUFACTURER);
		System.out.println("----------");
	}
	
	public static void printTaste() {
		System.out.println(MANUFACTURER);
		//System.out.println(name); //static이 아닌 멤버 변수라서 에러가 발생
		System.out.println("크~JMT");
	}
}