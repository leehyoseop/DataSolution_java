import java.util.Iterator;
import java.util.Scanner;

public class CMain1 {
	//국어 시험 점수를 입력해서 받아오기
	public static int getKoreanScore() {
		System.out.println("국어 시험 점수 입력 :");
		int kor = new Scanner(System.in).nextInt();
		return (kor>=0 && kor<=100 ? kor : getKoreanScore());
	}
	
	//조건문 : 작성한 코드를 조건에 따라 코드의실행 흐름을 다르게 동작하도록 제어하는 문법
	
	//if문 : 조건식의 결과가 true, false로 실행문이 결정
	//if (조건 A) {
	//		조건 A가 만족했을 시 (참일때) 이 부분이 실행
	//} else if (조건 B) {
	//		조건 A(X), 조건 B(O) 이 부분이 실행
	//} else if (C) {
	//		조건 A(X), 조건 B(X), 조건 C(O) 이 부분이 실행
	//} else if (condition) {
	//	
	//} else {
	//		맞는 조건이 하나도 없으면 이 부분이 실행
	//}
	
	public static void main(String[] args) {
		int kor = getKoreanScore();
		System.out.printf("입력된 국어 시험 점수 = %d점\n", kor);
		
		if (kor<60) {
			System.out.println("가");
		} else if (kor>=60 && kor<70) {
			System.out.println("양");
		} else if (kor>=70 && kor<80) {
			System.out.println("미");
		} else if (kor>=80 && kor<90) {
			System.out.println("우");
		} else {
			System.out.println("수");
		}
		//90부터 차례대로하면 &&안써도된다
		
		//국어 점수가 50점이 안되면 욕, 아니면 칭찬
		//점수가 50점이상, 60점 미만이면 아쉬운 소리 출력
		//if문 안에 if문을 또 사용하는 것이 가능!
		//	if-if문과 if-else문의 차이
		//		if-if : 각각 다른 조건문으로 해석이 되어서 수행하게됨 => 효율적이지는 않음!
		//		if-else : 하나의 조건이 만족되면 나머지 부분은 수행하지 않음 => 효율적 O
		//점수가 30점 미만이면 한국인이십니까?
		if (kor<50) {
			System.out.println("욕");
		} else if (kor>=50 && kor<60){
			System.out.println("아쉬운 소리");
		} else if (kor<30) {
			System.out.println("한국인이십니까?");
		} else {
			System.out.println("칭찬");
		}	
	}
}