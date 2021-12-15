
public class CMain1 {
	public static void main(String[] args) {
		//신발
		//나이키 홈페이지
		Shoes s1 = new Shoes();
		Shoes s2 = new Shoes();
		
		//Shoes("조던 스모키 그레이", 285, 400000);
		s1.name = "조던1 레드로하이 스모키 그레이";
		s1.size = 285;
		s1.price = 400000;
		
		s2.name = "조던1 레트로하이 보르도";
		s2.size = 285;
		s2.price = 263000;
		
		s1.printInfo();
		System.out.println("==========");
		s2.printInfo();
		
		Shoes.printBrandInfo();
		
		s2.test(s2.name);
		s2.test("zzzz");
	}
}