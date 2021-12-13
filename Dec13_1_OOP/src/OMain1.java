//알고리즘의 시대 X -> 유지보수의 시대

//절차지향 프로그래밍(Procedural Programming)
//		순서대로 잘 프로그래밍해서 결과를 잘 내자!
//		변수 하나 덜 쓰고, 효율적으로 코드 짰음
//		조건문.. 반복문..
//		장점 : 처리속도, 실행속도가 빠르다.

//객체지향 프로그래밍(Object-Oriented Programming)
//		실생활을 표현하자(우리가 살고있는 현실을 모델링)
//		소스보기 더 편함
//		유지보수에 용이
//		장점: 코드의 재사용성, 유지보수에 용이, 대규모 프로젝트에 적합.



public class OMain1 {
	public static void main(String[] args) {
	//	학원 옆에 있는 바나프레소 카페의 정보를 표현하고 싶다.
		String name = "바나프레소";
	//	카페 위치가 학원 옆
		String location = "학원 옆";
	//	거리가 97.2m
		double distance = 97.2;
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//OOP로 바나프레소를 표현
		//객체(Object) : 실생활에 존재하는 모든 것
		//		붕어빵을 만드려면 붕어빵 틀이 필요..!
		//		객체를 만들려면 'Class' 필요
		//객체를 사용해서 하나의 완성품을 만드는 프로그래밍 기법이
		//-> 객체지향 프로그래밍
		//-> 앞으로는 Class를 엄청 만들거!
		Cafe c = new Cafe();//새로운 카페를 하나 만들어 놓은 상태!
		c.name = "바나프레소";
		c.location = "학원 옆";
		c.distance = 97.2;
		System.out.println(c.name);
		System.out.println(c.location);
		System.out.println(c.distance);
		
		
		Phone p1 = new Phone();
		p1.model = "아이폰";
		p1.country = "중국";
		p1.price = 130.55;
		
		p1.prinInfo();
		p1.Ring();
		
		Phone p2 = p1; // 얘네둘이 번지값이 같다. c1의 별명이 하나 더 추가된 상황이다. -> c2=c1이라 공유
		
		
		
		
		
	}
}
