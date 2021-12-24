package com.hyoseop.dec242.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.hyoseop.dec242.student.Student;

public class CMain2 {
	public static void main(String[] args) {
		//학생의 번호를 입력하면 
		Scanner k = new Scanner(System.in);
		System.out.println("번호 : ");
		int no = k.nextInt();
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("ㅋㅋ", 30, 30, 10));
		students.add(new Student("ㅎㅎ", 40, 40, 10));
		students.add(new Student("ㅇㅇ", 50, 50, 10));
		students.add(new Student("ㅁㅁ", 60, 60, 10));
		
		//해당 번호 학생의 전체정보가 출력될 수 있게
		students.get(no-1).printInfo();
		System.out.println();
		System.out.println(students.get(no-1).getEng());
		
		for (int i = 0; i < students.size(); i++) {
			//번지값
			System.out.println(students.get(i));
			students.get(i).printInfo();
		}
	}
}
