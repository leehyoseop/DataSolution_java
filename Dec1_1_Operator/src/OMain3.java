import java.util.Scanner;

//논리 연산자
//		결과가 boolean(true/false) 
//		>(초과), >=(이상), ==(같다), !=(다르다), <(미만), <=(이하)
//		
//
//
public class OMain3 {
	public static void main(String[] args) {
		//놀이공원에서 놀이기구를 타도 되나 판정해주는 프로그램!
		//키(cm), 나이
		//키는 XXXcm, 나이는 XX살
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		double height = input.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = input.nextDouble();
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		
		System.out.printf("키 %.1fcm | 몸무게 %.1fkg | 나이 %d살\n", height, weight, age);
		
		//나이 10살이 넘는 사람만 탈 수 있음
		
		//boolean ride = (age > 10); 이렇게해줄수도 있네!
		
		System.out.printf("나이 10살이 넘나요?\n "
				+ "----> %b\n", age>10);
		
		//나이가 다섯살 미만 만탈수 있음
		
		boolean fiveYearRide = (age < 5);
		System.out.printf("나이 5살이 안넘나요?\n "
				+ "----> %b\n", fiveYearRide);
		
		//나이 20살만 탈 수 있음!
		
		boolean twentyYearRide = (age == 20);
		System.out.printf("나이 20살이에요?\n "
				+ "----> %b\n", twentyYearRide);
		
		//나이 1살만 아님 탈 수 있음!
		
		boolean notOneYearRide = (age != 1);
		System.out.printf("1살만 아니면 탑승 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", notOneYearRide);
		
		//나이가 홀수인 사람만 탈 수 있음!
		
		boolean oddYearRide = (age%2 != 0);
		System.out.printf("나이가 홀수만 탑승 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", oddYearRide);
		
		//!!!고급 내용!!!
		//	~고 : and = &&
		//	~거나 : or = ||
		//	XOR : ^	(exclusive OR) 두 입력이 서로 다를 때 '1' 결과값을 출력
		//	NOT : ! => 결과를 뒤집는 용도로 사용
		
		//나이가 3살이 넘고, 키가 2m 넘어야 탈 수 있음
		boolean ride6 = ((age>3) && (height>200));
		// 나이가 3살이 넘고, 키가 2m 넘어야 탈 수 있음
		//        95%			5%    =>95%의 확률로 2번 검사해야...
		// 키가 2m 넘어야 탈 수 있음, 나이가 3살이 넘고, 
		//        5%			95%    =>95%의 확률로 1번만 
		// #####=> 확률이 낮은 것을 앞에 배치!
		System.out.printf("나이가 3살이 넘고, 키가 2m 넘어야 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", ride6);
		
		//키가 1.9m 넘거나 나이가 50살 미만이면 탈 수 있음
		boolean ride7 = ((age<50) || (height/100 > 1.9));
		
		// 키를 m로 변환 height /= 100;
			
		// #####=> OR는 확률이높은것을 앞에 배치
		System.out.printf("키가 1.9m 넘거나 나이가 50살 미만이면 탑승 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", ride7);
		
		// 10 < 나이 < 40이면 탈 수 있음
		boolean ride8 = (age<40 && age>10);
		System.out.printf("나이가 10 < 나이 < 40이면 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", ride8);
		
		//나이가 10살 이상이던지, 키가 1.5m이상이던지 하나만
		//XOR
		height/=100;
		boolean ride9 = (age>=10 || height>=1.5);
		System.out.printf("나이가 10살 이상이던지, 키가 1.5m이상이면 탑승 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", ride9);
		
		//ride9를 탈 수 있는 사람은 못타고, ride9를 탈 수 없는 사람만 탈 수 있음
		boolean ride10 = (ride9 == false);
		//##### boolean ride10 = !ride9; #####
		System.out.printf("ride9를 탈 수 있는 사람은 못타고, ride9를 탈 수 없는 사람이면 탑승 가능합니다. 탑승 가능?\n "
				+ "----> %b\n", ride10);
		
		//불대수
		
		
	}
}