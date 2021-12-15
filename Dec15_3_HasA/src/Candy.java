//Candy has a company : ¡¶¡∂ªÁ
//Company has a Candy : ¡¶«∞
public class Candy {
	String name;
	String taste;
	Company b;
	
	
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	public void printInfo() {
		System.out.printf("ªÁ≈¡ ¿Ã∏ß: %s\n", this.name);
		System.out.printf("ªÁ≈¡ ∏¿: %s\n", this.taste);
	}
	
}
