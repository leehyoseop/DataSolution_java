//실행용 Class : 프로그램 실행을 위한 main() method를 제공하는 역할
public class OMain4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName = "홍길동";
		s.StudentAddress = "강남구";
		System.out.println("s가 Student 객체를 참조");
		System.out.println(s);
		s.showStudentInfo();
		s.printInfo();
		System.out.println("=====================");
		Student s1 = new Student();
		s1.studentName = "김길동";
		s1.StudentAddress = "강서구";
		System.out.println("s1이 Student 객체를 참조");
		System.out.println(s1);
		s1.showStudentInfo();
		s1.printInfo();
	}
}
