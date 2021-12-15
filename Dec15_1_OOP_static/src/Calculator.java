//멤버변수 없음 -> 저장할게 없음.
//			->계산기 객체를 만들 필요 없음.
//			->static메소드 기반
public class Calculator {
//	int x;
//	int y;
	
	public void plus(int x, int y) {
		System.out.printf("%d + %d = %d",x,y,x+y);
	}
	public static int plus(int x, int y, int z) {
		System.out.printf("%d + %d + %d = %d",x,y,z,x+y+z);
		return x+y+z;
	}
}
