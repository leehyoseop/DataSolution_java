package com.hyosoep.dec211.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
	public static void main(String[] args) {
		//Window는 경로에 대한 대소문자 구별안함
		//Linux는 대소문자를 구별함
		BufferedReader br = null;
		try {
			//파일 -> 프로그램
			FileReader fr = new FileReader("C:\\Users\\wtime\\Desktop\\java\\HHHHH.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
