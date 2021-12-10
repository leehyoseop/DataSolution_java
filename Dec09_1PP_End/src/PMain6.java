import java.util.Scanner;

//bubble sort
//숫자를 입력받아서 배열에 담을것
//정렬전 값을 출력
//정렬
//정렬 후 값을 출력
//각각함수 만들어서
public class PMain6 {
	
	public static int[] bubbleSort(int[] box) {
		int temp = 0;
		for (int i = 0; i < box.length-1; i++) {
			for (int j = 0; j < box.length-1; j++) {
				if(box[j]>=box[j+1]) {
					temp = box[j];
					box[j] = box[j+1];
					box[j+1] = temp;
				}
			}
		}
		int[] sorted_box = box; 
		return sorted_box; 
	}
	
	public static int[] getNum() {
		Scanner input = new Scanner(System.in);
		
		int[] x = new int [] {0,0,0,0,0};//new int[5] 배열 길이 조정가능
		System.out.println("숫자 5개를 하나씩 입력해주세요: ");
		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();
			x[i] = num;
		}
		return x;
	}
	
	public static void main(String[] args) {
		int[] array = getNum();
		System.out.println("<정렬전 배열 값>");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s ", array[i]);
		}
		//System.out.println(array.length);
		System.out.println();
		System.out.println("<정렬후 배열 값>");
		int[]sorted_array = bubbleSort(array);
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s ", sorted_array[i]);
		}		
	}
}
