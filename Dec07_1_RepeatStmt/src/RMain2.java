import java.util.Iterator;

//戚掻 for庚 >> for庚 照拭 for庚 >> (掻淡 for庚)

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("-----%d税 姥姥舘-----\n", i);
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//			}
//			System.out.println("------------------");
//		}
//		
//		System.out.println("<2舘>\t\t<3舘>\t\t<4舘>\t\t<5舘>"
//				+ "\t\t<6舘>\t\t<7舘>\t\t<8舘>\t\t<9舘>\t\t");
//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				System.out.printf("%d x %d = %d\t", j , i, j*i);
//				if (j == 9) {
//					System.out.println("\n");//戚係惟 源壱 嬢託杷 魁蟹艦苑 湛腰属 鋼差庚
//				}
//			}
//		}
// 紺啄奄	-> 植漆汗界生稽
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
		//せせせせせ
		//ぞぞぞぞ
		//せせせ
		//ぞぞ
		//せ
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i ; j--) {
				System.out.print((i%2 == 0) ? "せ" : "ぞ");
			}
			System.out.println();
		}
		//せ
		//ぞぞぞ
		//せせせせせ
		//ぞぞぞぞぞぞぞ
		//せせせせせせせせせ
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print((i%2 == 0) ? "せ" : "ぞ");
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