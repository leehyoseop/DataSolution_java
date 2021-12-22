package com.hyosoep.dec211.main;

import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	//학생의 이름/생년월일(yyyyMMdd)/국어/수학/영어를 입력받아서
	//학생의 나이, 총점, 평균값을 출력
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String studentInfo = null;
		String[] info = new String[4];
		
		
		System.out.println("학생의 정보를 입력해주세요\n(이름/생년월일(yyyyMMdd)/국어/수학/영어): ");
		studentInfo = input.next();
		info = studentInfo.split("/");
		
		//학생 나이 출력
		int tempStAge = Integer.parseInt(info[1].substring(0, 4));
		//System.out.println(temp_stAge);
		Date now = new Date();
		int tempNow = now.getYear()+1900;
		int real_stAge = tempNow - tempStAge + 1;
		System.out.println(real_stAge);
		
		//학생 총점
		int stSumScore = Integer.parseInt(info[2])+Integer.parseInt(info[3])+Integer.parseInt(info[4]);
		System.out.println(stSumScore);
		
		//학생 평균
		double stAvgScore = (double)stSumScore/3;
		System.out.println(stAvgScore);
		
		
		
	}
}
