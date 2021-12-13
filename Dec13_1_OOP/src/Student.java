//라이브러리용 Class(API:application Program Interface)
//				: 다른 Class에서 이용할 목적
//프로그램에서 실행되는 Class가 여러개, 단 하나를 빼고는 전부 다 라이브러리용;
//	제외됐던 하나의 Class : 실행용
public class Student {
	//멤버변수 (Member variable) / 필드 (Field) : 객체의 데이터가 저장되는 곳
//											변수와 비슷하게 생겼지만 변수는 아님
//	-변수 : 생성자, 메소드 내에서만 사용되고,
//			생성자, 메소드의 실행의 종료되면 함께 자동으로 종료.

//	-필드 : 생성자, 메소드 전체에서 사용이 가능
//			객체가 소명되지 않는 한 객체와 함께 공존
//	초기값이 지정되지 않은 멤버변수는 객체 생성시 자동으로 기본 초기값을 설정.
	
	int studentID;
	String studentName;
	String StudentAddress;
	
	//method(메소드) : 객체의 동작에 해당하는 실행블록
	//	중괄호 블록을 의미 >> 이름 붙인것이 method명 (동사스럽게 짓기)
	//	메소드를 호출 시, 이 영역 안의 모든 코드를 일괄적으로 실행.
	//	객체 간의 데이터를 전달 수단
	//	
	public void showStudentInfo() {
		System.out.println(studentName + " " + StudentAddress);
	}
	
	public void printInfo() {
		System.out.println(this.studentName);
		System.out.println(this.StudentAddress);
	}
}
