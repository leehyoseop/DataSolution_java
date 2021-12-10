
public class VMain3 {
	public static void main(String[] args) {
		// 점심식사 메뉴(이름), 가격, 칼로리, 평점, 나중에 또 먹을지
		System.out.println("*****점심식사 메뉴*****");
		String menu = "동태탕";
		int price = 7000;
		int kcal = 1000;
		double score = 4.7127456;
		boolean Again = true;
		
		System.out.printf("메뉴 : %s\n가격 : %d\n칼로리 : %d\n평점 : %.3f\n"
				+ "재방문 : %b", menu, price, kcal, score, Again);
		
		
	}
}