
public class Computer {
	String cpu;
	int ram;
	int hdd;
	Company co;
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String cpu, int ram, int hdd, Company co) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.co = co;
	}

	public void printInfo() {
		System.out.printf("CPU : %s\n", this.cpu);
		System.out.printf("RAM : %d\n", this.ram);
		System.out.printf("HDD : %d\n", this.hdd);
		co.printInfo();
	}
}
