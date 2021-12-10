
public class PMain2 {
	public static void main(String[] args) {
		//1. Escape Sequence (이스케이프 문자)
		//		: 특수한 문자나 특수한 기능을 표현할때 역슬래시 \ 를 사용해서
		
		//	\t : Tab키 (줄 맞춰주는 용도)
		//	\n : New Line (줄만 맞추는 용도)
		//	\r : Carriage Return (커서를 맨 앞으로)
		//	\r\n : Enter키의 기능
		//	\b : Backspace키 기능(1byte만 지움) -> Java에서는 사용 X
		//			C언어 - 한 글자: 1Byte
		//			Java - 한 글자 : 2Byte
		//	\0 : 빈칸(Space키)
		
		System.out.println("오늘 날짜\t: 2021.11.29");
		System.out.println("요일\t: 월요일");
		System.out.println("내일은\n 비가 온\r다고 합니다...");
		System.out.println("그리고 춥\0대요...ㅠㅠ");
		
		
		//현재 : 가볍게 확인용도로 사용있는 콘솔창이라서
		//	\r이나 \n하나만 있어도 enter키 처리가 가능함.
		// 파일처리/통신 : \n이나 \r 하나만 쓰게되면.. 다 뒤집어짐...!
		//	->	이클립스 안에서는 \r과 \n 구분하기가 어려움...
		//	->	\n으로 엔터처리 하고, 이후 파일처리에서 \r, \n을 다뤄보자!
		
		// \(^_^)/ , (".")
		System.out.print("\\(^_^)/");
		// !!!!!	\\ : \를 글자로! -> 경로를 설정할때
		
		System.out.println("(\".\")");
		// !!!!!	\" : "를 글자로 사용하고 싶을때
		
	}
}
