package com.hyosoep.dec211.main;

import java.util.StringTokenizer;

public class TextMain {
	//버전
	//	1.8.12
	//	앞자리 major(1)
	//	뒷자리 minor(8.12)
	//		더 뒷자리로 갈수록 더 minor
	//	버전업(1.8.12 -> 1.8.13) : 살짝 수정
	//	버전업(1.8.12 -> 1.9.0) : 변화에 어느정도 느낌이 오는
	//	버전업(1.8.12 -> 2.0.0) : 새로운 프로그램
		
	// 네트워크를 통해서 데이터를 받아오면 : 글자형태
	// 네트워크를 통해서 데이터를 줄때 : 글자형태
	// 한글처리하기가 까다로워...
	public static void main(String[] args) {
		String s1 = "으아아아아아아아아";//기본형X, 약식이다! 
		
		String s2 = new String("곧 있으면 크리스마스! 너무 신나요!");
		
		//s2에서 3번째에 있는 글자만 출력
		System.out.println(s2.charAt(2));
		
		String result = s2.replace(" ", "");
		
		System.out.println(result.length());
		
		System.out.println(s2.startsWith("곧"));
		
		System.out.println(s2.contains("! 너"));
		
		System.out.println(s2.replace("크리스마스", "새해"));
		
		System.out.println(s2.substring(1, 5));
		
		//String 객체를 생성하는데 형식을 잡아서 
//		String s3 = String.format("무게 : %2.f kg", 123.456789);
//		System.out.println(s3);
		
		//s2에 글자 추가
		s2 = s2 + "내년에는 모두 다 잘 됐으면 좋겠어요!";
		System.out.println(s2);
		s2 += " 모두 부자 되세요 ^-^";
		s2 = new String(s2 + "ㅎㅎㅎㅎ");
		
		//String 대량으로 추가하기 =====
		StringBuffer sb = new StringBuffer(s2);
		sb.append("일은 적게하되 돈은 많이 벌게 해주세요!");
		sb.append("껄껄껄껄");
		sb.append("근데 주말에도 일해야되요!");
		System.out.println(sb);
		
		String s4 = sb.toString();
		
		String s5 = "김비버,박비버,최비버,오비버";
		//1.split ===============
		String[] s5Ar = s5.split(",");
		System.out.println(s5Ar);
		
		//2.StringTokenizer ===============
		StringTokenizer st = new StringTokenizer(s5,",");//골라서 사용할 수 있다.
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {	//반복문형식(while문 + 순서대로 나옴!)
			System.out.println(st.nextToken());
		}
		
		String a = "I,My,,Me,Mine";
		a.replace(",,", ",");

		System.out.println("-----");
		String[] aArr = a.split(",");
		for (String string : aArr) {
			System.out.println(string);
		}
		
		StringTokenizer aSt = new StringTokenizer(a, ",");
		while (aSt.hasMoreTokens()) {
			System.out.println(aSt.nextToken());
		}
		
	}
}
