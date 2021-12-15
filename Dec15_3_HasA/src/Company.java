
public class Company {
	String brand;
	String location;
	int worker;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}


	
	public Company(String brand, String location, int worker) {
		super();
		this.brand = brand;
		this.location = location;
		this.worker = worker;
	}

	public void printInfo() {
		System.out.printf("회사 이름: %s\n", this.brand);
		System.out.printf("회사 위치: %s\n", this.location);
		System.out.printf("회사 직원수: %d\n", this.worker);
	}
}
