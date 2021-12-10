
public class PMain4 {
	public static void main(String[] args) {
		String[] ss = {"zz", "gg", "dd", "^_^"};
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]+" ");
		}
		System.out.println("-----------------");
		//String s = null;//
		
		//for-each문 (신형 for문)
		//배열의 요소를 변경할때는 사용X !
		//	원본을 쓰는게 아닌 임시로 복사해다 쓰는 개념이라
		//		원본에는 영향 X!
		//	순서 조절이 불가능!
		//		i(인덱스)가 없어서 원하는 값만을 사용할 수 없음
		//		그래서 활용도가 떨어짐..!
		//
		//for(자료형 변수명 : 배열명) {내용}
		for (String s2 : ss) {
			//배열 ss의 요소를 s2라는 그릇에 담아서...
			System.out.println(s2);//출력(배열의 요소 순서대로!)
		}
	}
}