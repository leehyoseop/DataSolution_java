
public class PMain3 {
	public static void main(String[] args) {
		// printf
		// System.out.printf("%?", 값); 의 형태

		// 정수 (decimal)
		// %d : 정수 데이터가 들어올 자리(10진수)
		// %xd : 빈자리가 띄어쓰기로 채워져서 출력
		System.out.printf("%d\n", 1);
		System.out.printf("%3d\n", 1);
		// %0xd : 빈자리를 0으로 채워서 x자리의 숫자로 만들어준다.
		System.out.printf("%d\n", 11);
		System.out.printf("%3d\n", 11);
		System.out.printf("%03d\n", 11);

		// 실수 (float)
		// %f : 실수 데이터가 들어올 자리
		// %.xf : 소수점 이하의 자릿수(잘리는 부분은 반올림 처리)
		// 빈자리는 0으로 채워줌
		System.out.printf("%f\n", 123.456789);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);

		// %s : 글자데이터가 들어올 자리(String)
		// 숫자 : 그냥 입력하면 됨!
		// 글자 : 그냥 입력하면 Java의 문법으로 해석하기 때문에 -> 오류!
		// -> "내용" (큰 따옴표 안에 글자넣기!)

		System.out.printf("%s\n", "클라우드 공부");
		System.out.printf("%s\n", "오늘 하루도 이렇게..!");

		
		System.out.printf("%d년 %d월 %d일\n", 2021, 11, 29);
		// 오늘 날짜기준 연도
		System.out.printf("%d년", 		2021);
		// 월
		System.out.printf("%d월", 11);
		// 일
		System.out.printf("%d일", 29);
		// 날씨 : 구름
		System.out.printf("\n날씨 : %s", "구름");
		// 기온 : 5도
		System.out.printf("\n기온 : %d도", 5);
		// !!!!!습도 : 21.58%
		// %% : %를 글자로 표현할 때(printf에서)
		
		System.out.printf("\n습도 : %.2f%%", 21.58);

	}
}
