import java.util.Random;
import java.util.Scanner;

public class YMain1 {
	//홀짝게임 만들기!
	// 동전 10개를 쥐고 있다가
	//내가 '홀'하면 
		
	public static void main(String[] args) {
		
		System.out.println("\t<홀짝게임>\t");
			
		System.out.println("컴퓨터가 동전을 랜덤하게 뽑는중 입니다 ...");
		
		Random r = new Random();
		int coin = r.nextInt(10) + 1; // 0~4 -> 1~5
		System.out.println(coin);
		
		String result = (coin%2 == 0) ? "짝" : "홀"; //이거 char는 없다
		System.out.println(result);
		
		System.out.println("=====홀 | 짝 중에 골라서 입력=====");
		Scanner input = new Scanner(System.in);
		String user = input.next();
	
		boolean prize = (result.equals(user));
		
		String end = (prize == true) ? "맞췄습니다:)" : "못맞췄습니다:("; //여기 굳이 이렇게 안해도 됨 String x = (result.equals(user)) ? 정답 : 오답
		System.out.println(end);
		
	}
}
