import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		//이름을 하나 입력받을거...
		//그 이름이 '홍길동'이랑같은지 true / false
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = input.next();
		
		//System.out.println(name);
		
		//name == "홍길동" ----> 이건 그냥 번지 수 비교
		boolean test = (name.equals("홍길동"));
		boolean test2 = ("홍길동".equals(name));
		//equals 대상의 값 자체를 비교하기 위해서 사용한다.
		//System.out.println(test);
		//System.out.print(test2);
		
		// Shift 연산자 : 다중선택..!
		// shift : 옮기다. 이동하다
		// (십진수 << 정수)의 형태
		// << : 앞에 있는 수를 2진수로 바뀌고, 뒤에 있는 수만큼 왼쪽으로 밀어라
		// 비어있는(오른쪽) 칸 수를 0으로 채우고, 2진수를 다시 10진수로 바꿔라
		
		// ex) 카페!
		//		24시간 : 1 << 0 = 1
		//		와이파이 : 1 << 1 = 2
		//		흡연실 : 1 << 2 = 4
		//		주차장 : 1 << 3 = 8
		
		// A매장 : 2	와이파이
		// B매장 : 8 주차장
		// C매장 : 13 24시간/흡연실/주차장
		// D매장 : 6 와이파이/흡연실
		
		int c = (150 << 6);
		//System.out.println(c);
		
		// 나이 값도 입력해서 받아볼거
		// 나이가 20살 이상이면 '안녕하세요'
		// 나이가 20살 미만이면 'NAGA!'를 출력
		
		//연산자
		//		단항연산자 : a++, a--, !a, ...
		//		이항연산자 : a+b, a>10 
		//		삼항연산자 : 조건을 따져서 값을 대입할 때 사용한다.
		//					if문으로 대체가능하지만 문법이 길어짐
		//					조건식 ? 조건을 만족할때 쓸 값 : 조건불성립시 쓸 값
		System.out.println("나이를 입력하세요 : ");
		int age = input.nextInt();
		
		//String result = (age >= 20) ? "안녕하세요" : "NAGA!";
		
		//System.out.println(result);
		
		//나이가 50살 이상이면 '강녕하세요'
		//나이가 50살 미만이면 '안녕하세요'를 출력
		
		//String result2 = (age >= 50) ? "강녕하세요" : "안녕하세요";
		//System.out.println(result2);
		
		//double result3 = (age>=10) ? 1000 : 50;
		//System.out.println(result3);
		
		//홍길동씨 : 1강의장
		//나이가 짝수 : 1강의장
		//이외에 나머지는 : 2강의장
		
		//String place = ((age%2 == 0) || name.equals("홍길동")) ? "1강의장" : "2강의장";
		//System.out.println(place);
		
		//이름이 곽두팔이면서 10살 이하면 1강의장
		//나머지는 2강의장
		
		String place = ((age <= 10) && name.equals("곽두팔")) ? "1강의장" : "2강의장";
		System.out.println(place);
	
	}
}
