
public class FMain3 {
	
	public static void test(int q) {
		System.out.println(q); //10
		q = 20;
		System.out.println(q); //20
	}
	
	public static void main(String[] args) {
		int q = 10;	//지역변수이다
		System.out.println(q); //10
		test(q); 
		System.out.println(q); //10
	}
}