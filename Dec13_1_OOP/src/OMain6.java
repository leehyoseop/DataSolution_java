//Coder : 개발자
// Programmer : Coder + 설계 

//OOP + OOD(Object Oriented Design) 객체 지향 디자인
//		실생활을 디자인
public class OMain6 {
	//의사 (이름, 나이)
	
	//손님 (이름, 나이)
	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.Name = "이효섭";
		d.age = 56;
		
		Patient p = new Patient();
		p.Name = "김효섭";
		p.age = 16;
		
		d.printInfo();
		p.printInfo();
		
	}
}
