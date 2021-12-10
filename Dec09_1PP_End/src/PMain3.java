
public class PMain3 {
	public static void sum(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		//return x+y;
	}
	public static void sum(int x, int y, int z) {
		System.out.printf("%d + %d + %d= %d\n", x, y, z, x+y+z);
		//return x+y;
	}
	//오버로딩 : 굳이 함수 이름을 다르게 할 필요없다
	//	함수 파라미터로 개수를 무제한으로 나타내고 싶을때 (자료형...변수명)을 입력해준다
	public static void printMul(int...n) {
		int mul = 1;
		for (int i = 1; i < n.length; i++) {
			mul*=n[i];//이거 쓰기 좋다.
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		sum(10,20);
		sum(1,2,3);
		printMul(1,2,3);
	}
}