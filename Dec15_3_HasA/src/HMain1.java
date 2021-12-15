//객체간의 관계
//A has a B : 사람 has a 핸드폰
//A is a B : 개 is a 동물
public class HMain1 {
	public static void main(String[] args) {
//		Candy c = new Candy("청포도", "청포도");
//		
//		c.printInfo();
		//co.printInfo();
		
		//청포도 사탕을 롯데에서 만들었다.
		//c.b = co;
		//c.b.printInfo();
		
		//삼성,수원,300명이 다니는 회사의 정보를 출력
		
		//CPU가 i7-1234, RAM 32GB, HDD 500GB인 삼성 컴퓨터
		//컴퓨터/회사 정보 출력.
		Company co = new Company("삼성", "수원", 300);
		Computer com = new Computer("i7-1234", 32, 500, co);
		//com.co = co;
		com.printInfo();
	}
}
