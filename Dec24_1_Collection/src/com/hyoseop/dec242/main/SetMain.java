package com.hyoseop.dec242.main;

import java.util.HashSet;

//Set 계열
//		가변사이즈
//		중복데이터 자동 삭제
//		같은 객체가 여러번 들어가면 하나의 값만 남긴다
//		순서가 랜덤
//		hashset, treeset => 실전에서는 그다지 유용하지 않음
//
public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("ㅁㅁ");
		hs.add("ㄴㄴ");
		hs.add("ㅇㅇ");
		hs.add("ㄹㄹ");
		hs.add("ㅂㅂ");
		hs.add("ㅋㅋ");
	}
}
