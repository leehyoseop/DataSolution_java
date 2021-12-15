
public class Coffe {
	String name;
	int price;

	public Coffe() {
		// TODO Auto-generated constructor stub
		//객체의 값을 초기화하는데 목적!
	}
	
	public Coffe(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.printf("커피 이름 : %s\n", this.name);
		System.out.printf("커피 가격 : %d", this.price);
	}
}