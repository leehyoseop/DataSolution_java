//정리
//1.기계어 상태의 소스가 stack영역에 깔림
//2.static 멤버 변수들이 static영역에 배치
//3.JVM이 SMain1.main(을 호출)
//4.실행 
public class SMain1 {
	public static void main(String[] args) {
		//과자 객체
		//이름/중량/가격
		//현재 main에는 과자가 없는 상태
		//과자 이름? -> 모름
		//과자 중량? ->모름
		//과자 가격? ->모름
		//과자 생산자? ->김비버
		
		
		System.out.println(Snack.MANUFACTURER);
		Snack s1 = new Snack();
		s1.name = "허니버터칩";
		s1.gram = 150.3;
		s1.price = 3000;
		s1.printInfo();
		
		
		Snack s2 = new Snack();
		s2.name = "프링글스";
		s2.gram = 200.1;
		s2.price = 3500;
		s2.printInfo();
		//일단 생산자는 다 김비버가 맞다!
		//s2.MANUFACTURER = "최비버";
		s2.printInfo();
		s1.printInfo();
		
		Snack.printTaste();
	}
}