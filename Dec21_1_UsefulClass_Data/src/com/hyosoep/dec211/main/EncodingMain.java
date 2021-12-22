package com.hyosoep.dec211.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncodingMain {

	// Encoding : 정보의 형태나 형식을 변환하는 처리나 처리방식
	// 컴퓨터 : 전자기계 (전기가 흐르거나 안흐르거나)
	// 'ㅋ'->전기의 흐름으로 표현(모스부호) -> Encoding

	// Decoding : 인코딩된 데이터 통신 전송 및 파일을 원래 상태로 변환
	// 전기의 흐름->'ㅋ'
	// encoding 방식은여러종류가 있음!
	// 크리스마스-A->1010-A->크리스마스
	// 크리스마스-B->0101-B

	// 전세계적으로 주력 : UTF-8(unicode transform format)
	// 한국만 타겟 : EUC-KR
	// MS전용 : MS949

	// 9호선 -UTF-8 -> 1011 - MS949 -> ??

	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("C:\\Users\\wtime\\Desktop\\java\\hyoseop.txt", true);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null;
//		try {
//			osw = new OutputStreamWriter(fos, "utf-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		BufferedWriter bw = new BufferedWriter(osw);
//		try {
//			bw.write("leehyoseop zzang");
//			bw.append("\r\n");
//			bw.append("오늘은 수요일!!!" + "\r");
//			bw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\wtime\\Desktop\\java\\hyoseop.txt");

			InputStreamReader isr = new InputStreamReader(fis, "utf-8");

			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}