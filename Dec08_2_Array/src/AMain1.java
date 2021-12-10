//변수
//	변수 1: 데이터 1
//배열(Array) " [] "
//	변수 1 : 데이터 n
//배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//	배열 속 각각의 데이터를 '요소'라고 부른다.
//	이 요소마다 붙여진 일련번호가 있는데 각 요소를 구별하는데 사용
//	-> 인덱스(index) : 시작은 0부터!
// 배열 생성
// 자료형[] 변수명;	//배열선언
// 변수명 = new 자료형[];
//	-> 자료형[] 변수명 = new 자료형[배열의 길이 갯수]
public class AMain1 {
	public static void main(String[] args) {
		int[] english = new int[3]; // 1번
		english[0] = 100;
		english[1] = 70;
		english[2] = 50;
		System.out.println(english.length);
		for (int i = 0; i < english.length; i++) {
			//.length : 이 배열의 요소가 몇개인지 알려준다.
			System.out.println(english[i]);
		}

		int[] math = new int[] {10, 30, 60}; // 2번
		for (int i = 0; i < math.length; i++) {
			
		}
		int[] kor = {20, 40, 60};
		
		int a = 10;
		int[] b = {10, 20};
		System.out.println(a);
		System.out.println(b); // 번지값(주소값)
		b[2] = 200;// 배열 길이값을 초과함 이렇게 만들면 에러이다.
		System.out.println(b[2]);
		int[][] score = {{5,2},{5,2},{5,2}}; 
		System.out.println(score);//주소값(전체에 대한)
		System.out.println(score[0]);//주소값(첫번째 학생에 대한)
		System.out.println(score[1][0]);
		//단점 : 주석없이도 해석할 수 있는지 ?
	}
}
//java를 잘하는 사람?
//배열을 만들때 사이즈가 고정되어있음
//사이즈를 모르면 배열을 못만든다..
//따라서 자바에서의 배열은 별로다.