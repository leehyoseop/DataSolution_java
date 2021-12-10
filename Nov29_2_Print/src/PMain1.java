public class PMain1 {
	// main 치고 ctrl + spacebar
	public static void main(String[] args) {
		System.out.println("점심 맛있게 드셨다니 기쁩니다!");
		// syso + 자동완성 System.out.println();
		// syso :출력하는 기능!
		// 모든 실행할 문장들은 main안에서 이루어져야한다.

		// Print의 형태
		// 1.println : console창에 글자를 출력하고, 줄 바꿈. (제일 많이 사용)
		// ->괄호안에 값을 넣지 않으면 : 줄을 바꿔주는 역할!
		// 2.print : console창에 글자를 출력하고, 줄바꿈X (println보다는 덜 사용)
		//
		// 3.printf : console창에 형식을 지정해서 글자를 출력해준다.(ex : 소수점 자리수 같은..)
		System.out.println("println : 글자 출력 + 줄바꿈기능");
		System.out.print("print : 글자출력");
		System.out.println();
		System.out.printf("printf : 이거는 이따가 볼게요 ~");

		// ?.? : syso로 자동완성을 해보면 println이 나오는데 왜 print랑 printf는 자동완성이 없나?
		// ->println을 가장 많이 사용하기 때문이다
		System.out.println();
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);

		// ?.? : 큰따옴표를 사용하지 않았을까?!
		// -> 큰따옴표 사이에 내용을 넣으면 '글자'로 인식!
		System.out.println("10+2");
		System.out.println("10-2");
		System.out.println("10*2");
		System.out.println("10/2");

		// 계산이 안되고 10 + 2문자 그대로 나오는 걸 확인할 수 있음!
		// -> 내용들이 너무 붙어있어서 보기가 불편한데...
		//				-> ctrl shift f 가독성에 유리하다
		
		// 한글자당 2byte의 용량을 차지
		// 이 파일을 압축 -> 띄어쓰기, 줄바꿈, 들여쓰기를 없앰 -> 용량을 줄임
		// 가독성 vs 컴퓨터 자원 아끼기
		// 컴퓨터들 사양이 좋아짐 따라서 굳이 컴퓨터 자원을 아낄 필요가 없다.
		// 일단은 코드를 짜는대로 짜는데, 정렬단축키
		

	}
	// System.out.println("asdasdasd"); ----> 범위를 벗어났다!

}
