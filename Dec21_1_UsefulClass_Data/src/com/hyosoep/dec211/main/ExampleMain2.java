package com.hyosoep.dec211.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학생의 정보를 입력해주세요\n(이름/생년월일(yyyyMMdd)/국어/수학/영어): ");
		String student = input.next();
		
		String stName = null;
		String stBirth = null;
		String kor = null;
		String math = null;
		String eng = null;
		StringTokenizer info  = new StringTokenizer(student, "/");
		while (info.hasMoreTokens()) {
			stName = info.nextToken();
			stBirth = info.nextToken();
			kor = info.nextToken();
			math = info.nextToken();
			eng = info.nextToken();
		}
		//학생 나이 출력
		int stYear = Integer.parseInt(stBirth.substring(0, 4));
		Date now = new Date();
		int nowYear = now.getYear()+1900;
		int stAge = nowYear - stYear + 1;
		System.out.printf("학생의 한국 나이 : %d\n", stAge);
		//학생 총점
		int stSumScore = Integer.parseInt(kor)+Integer.parseInt(math)+Integer.parseInt(eng);
		System.out.printf("총점 : %d\n",stSumScore);
		//학생 평균
		double stAvgScore = (double)stSumScore/3;  
		System.out.printf("평균점수 : %.2f\n", stAvgScore);
	}
}
