import java.util.Iterator;

//이중 for문 >> for문 안에 for문 >> (중첩 for문)

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("-----%d의 구구단-----\n", i);
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//			}
//			System.out.println("------------------");
//		}
//		
//		System.out.println("<2단>\t\t<3단>\t\t<4단>\t\t<5단>"
//				+ "\t\t<6단>\t\t<7단>\t\t<8단>\t\t<9단>\t\t");
//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				System.out.printf("%d x %d = %d\t", j , i, j*i);
//				if (j == 9) {
//					System.out.println("\n");//이렇게 말고 어차피 끝나니깐 첫번째 반복문
//				}
//			}
//		}
// 별찍기	-> 엑셀느낌으로
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*") ;
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 ; j++) {
//				if (j<i) {
//					System.out.print(" ");
//				} else if(i == j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(" ");
				if(i == j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//ㅋㅋㅋㅋㅋ
		//ㅎㅎㅎㅎ
		//ㅋㅋㅋ
		//ㅎㅎ
		//ㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i ; j--) {
				System.out.print((i%2 == 0) ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		//ㅋ
		//ㅎㅎㅎ
		//ㅋㅋㅋㅋㅋ
		//ㅎㅎㅎㅎㅎㅎㅎ
		//ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print((i%2 == 0) ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}