package com.hyosoep.dec211.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Date : 날짜/시간
public class DateMain {
	public static void main(String[] args) {
		//기본생성 -> 현재시간/날짜
		Date now = new Date();
		
		//현재시간 날짜를 출력
		System.out.println(now);
		//Date.java는 아~~~주 옛날 만들어진 class
		//Y2K에 관심이 없던 시절
		//현재 실정에 맞지 않음
		//현재 용량이 적었기 때문에 연도 끝에 2자리만...
		//1970 이전의 컴퓨터 : 속도가 느리고 장치의 용량도 적었다
		//데이터량을 아끼기 위해서 연도를 4byte가 아닌 2byte로 할당
		//1900년, 2000년 끝의 두자리가 00으로 통일 -> 구분이 불가능
		//		-> 컴퓨터의 오작동 가능성이 높아짐
		//연도
		//월
		//일
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(day[now.getDay()]);
		
		//Date - 형식지정 -> String 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z",Locale.KOREA);
		String s1 = sdf.format(now);
		System.out.println(s1);
		
		//특정 시간 날짜
		Date d2 = new Date(2000, 11, 11);
		
		//String - 형식지정 -> Date
		String s2 = "2000/11/11";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d3 = sdf2.parse(s2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//10년전 크리스마스는 무슨 요일 일까요?
		String s3 = "2011/12/25";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d3 = sdf3.parse(s3);
			System.out.println(d3);
			System.out.println(day[d3.getDay()]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
