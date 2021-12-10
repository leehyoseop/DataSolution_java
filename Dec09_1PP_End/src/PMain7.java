import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain7 {
	
	//10개의 숫자를 랜덤으로 뽑아서 배열에 담을것

	public static void main(String[] args) {
//		Random r = new Random();
//		int num = 0;
//		int arr[] = new int[10];
//		for (int i : arr) {// 여기서 i는 arr의 각각의 요소들
//			num = r.nextInt(100)+1;
//			arr[i] = num;
//			System.out.printf(arr[i]+" ");
//		}
		
		Scanner input= new Scanner(System.in);
		int cnt=0;
		int[] hyoseop = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번째 숫자 입력: ", i+1);
			cnt = input.nextInt();
			hyoseop[i] = cnt;
		}
		
		System.out.println("<배열에 저장된 값>");
		for (int i : hyoseop) {	
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int q = 0; q < hyoseop.length-1; q++) {
			if(hyoseop[q]>=hyoseop[0]) {
				hyoseop[0] = hyoseop[q];
			}
		}
		System.out.printf("최댓값: %d", hyoseop[0]);
		System.out.println();
		for (int j = 0; j < hyoseop.length-1; j++) {
			if(hyoseop[j]<=hyoseop[0]) {
				hyoseop[0] = hyoseop[j];
			}
		}
		System.out.printf("최솟값: %d", hyoseop[0]);
	}
	
	
	//10개의 숫자를 직접 입력해서 배열에 담고 출력
	
}
