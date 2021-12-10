//면접 문제...0&0!!
//Call by value, Call by Reference
//어떻게 답이 도출되었는지 설명할 수 있어야!
public class PMain5 {
	
	//Call by value : 변수의 '값'을 복사해서 함수의 파라미터 값으로 사용하는 것
	//Call by reference : 변수를 참조하는 주소값(번지값)을 파라미터로 전달하는 것
	//stack기본형 변수 / 주소값 heap
	private static void test(int a, int b[], int c[]) {
		System.out.println("b(green)"+ b); //번지값
		System.out.println("c(green)"+ c); //번지값
		System.out.println(a + "a(green)"); //10
		System.out.println(b[0] + "b(green)"); //10
		System.out.println(c[0] + "c(green)"); //10
		a = 100;
		b[0] = 100; // main쪽에 영향을 줌(참조형)
					// 기본형과 참조형의 차이!
		c = new int[] {100, 200};
					//말 그대로 새로운 수(new)
					// new int[] 꼭 써줘야 -> 약식을 못쓰는 이유(정규식이 아니라서 / 말그대로 약식)
					// new int[] 가 정규식
		System.out.println("b(green)" + b); //번지값
		System.out.println("c(green)" + c); //번지값
		System.out.println("a(green)" + a); //100
		System.out.println(b[0] + "b(green)"); //100
		System.out.println(c[0] + "b(green)"); //100
	}

	public static void main(String[] args) {
		int a = 10;
		int[]b = {10,20};
		int[]c = {10,20};
		System.out.println("b(red)" + b); //번지값
		System.out.println("c(red)" + c); //번지값
		test(a,b,c);
		System.out.println(a + "a(red)"); //10
		System.out.println(b[0] + "b(red)"); //10이 아니라 100이다.값 변경에 영향을 받음. 
		System.out.println(c[0] + "c(red)"); //10 값 변경에 영향을 받지 않음.
											 //test함수의 변경된 c와는 다르기 때문에
	}
}