package com.hyosoep.dec211.main;

//Wrapper Class : 자료형 기본형들의 객체형
//	Integer, Double, Long, Void, Boolean
//	기본 자료형을 객체로 다루기 위해 사용하는 Class
//	Java의 기본형은 값을 가지고 있는 객체 생성이 가능
//	기본형이 가지고 있는 값을 내무에 두고 그 위를 포장하는 방식
//	Boxing : 기본형 -> 래퍼클래스
//	Unboxing : 래퍼클래스 -> 기본형

//	1.객체나 클래스가 제공하는 method를 사용할때
//	2.클래스가 제공하는 상수를 사용(MIN_VALUE, MAX_VALUE)
//	3.숫자, 문자로 형변환을 할때

public class WMain {
	public static void main(String[] args) {
		int a = 10;
		String a1 = "100";
		Integer b = new Integer(a1);
		b.intValue();
		System.out.println(b);
		System.out.println(b.TYPE);
		
		
		//기본형 -> 객체형
		double c = 123.456;
		Double d = new Double(c);
		
		//객체형 -> 기본형
		Boolean e = new Boolean(true);
		boolean f = e.booleanValue();
		
		//객체형 -> 기본형 (위의 과정을 자동으로 해줌 : Auto unboxing)
		Integer g = 10;
		
		//기본형 -> 객체형 (위의 과정을 자동으로 해줌 : Auto boxing)
		int h = g;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		//int 자료형의 값을 -> String(문자형)으로
		String num1 = Integer.toString(321);
		//int 자료형의 값 -> 2진수의 형태로(String)
		String num2 = Integer.toBinaryString(5);
		
		//String -> 기본형으로가려면 다이렉트로는 힘들고 객체형을 거쳐야한다.
		//String -> 객체형 -> 기본형
		
		String k = "345.67";
		
	}
}
