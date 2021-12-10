
public class VMain2 {
	public static void main(String[] args) {
		//섬유탈취제
		//가격이 1000원
		//용량이 80ml
		//향균이 99.9%
		//색깔은 무
		//회사가 다이소
		//재활용 해야함(%b)
		System.out.println("*****섬유탈취제*****");
		int price = 1000;
		int capacity = 80;
		double scent = 99.9;		
		String color = "무색";
		String company = "다이소";
		boolean recycle = true;
		
		System.out.printf("가격 : %d원\n용량 : %dml\n향균 : %.1f%%\n"
				+ "색깔 : %s\n회사 : %s\n재활용 유무 : %b", price, capacity, scent, color, company, recycle);
		//이름, 오늘 날짜(연도, 월, 일) 사는곳, 시력, java경험 유무
		String name = "이효섭";
		int yy = 2021;
		int mm = 11;
		int dd = 30;
		String resident = "일산";
		double L_eye = 0.5;
	    double R_eye = 0.4;
	    String exp = "초등학생";
	    System.out.println("\n########################");		
	    System.out.printf("이름 : %s\n오늘 날짜 : %d년 %d월 %d일\n거주지 : %s\n좌/우시력: %"
	    		+ ".1f / %.1f\n"
	    		+ "Java경험 수준 : %s", name, yy, mm, dd, resident, L_eye, R_eye, exp);
	}
}
