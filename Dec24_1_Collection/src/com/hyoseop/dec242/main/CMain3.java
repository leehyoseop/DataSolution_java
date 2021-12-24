package com.hyoseop.dec242.main;

import java.util.HashMap;
import java.util.Scanner;

import com.hyoseop.dec242.student.Student;

public class CMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("戚硯 : ");
		String name = k.next();
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("せせ", new Student("せせ", 30, 30, 10));
		students.put("ぞぞ", new Student("ぞぞ", 40, 40, 10));
		students.put("しし", new Student("しし", 50, 50, 10));
		students.put("けけ", new Student("けけ", 60, 60, 10));
		
		students.get(name).printInfo();
	}
}
