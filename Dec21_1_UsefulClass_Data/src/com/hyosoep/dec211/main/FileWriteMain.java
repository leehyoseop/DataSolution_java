package com.hyosoep.dec211.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//CPU	: 연산장치
//RAM	: 저장장치(임시) - 재부팅하면 날아감
//			static / stack - 프로그램을 끄면(종료하면) 날아감
//			heap : 자동으로 날아감 X (GC있으면 자동으로 날아감)
//HDD(SSD)	: 저장장치(영구) (파일 -> DB)
//GPU	: 그래픽처리용 (CPU +RAM + HDD)

//프로그램에서는 데이터를 외부에서 읽고, 다시 외부로 출력하는 작업이 자주 일어나는데
//데이터는 사용자로부터 키보드를 통해서 입력될 수도 있고(Scanner), 파일-네트워크에서도 입력될 수 있다.(Input)
//반대로 데이터는 모니터를 통해서 출력될 수도 있고, system.out.println
//파일.네트워크로도 출력될 수 있음! output

public class FileWriteMain {
	public static void main(String[] args) {
		//System.out -> outputstream
		//system.in -> inputstream
		//Stream : 빨대 -> 
		
		//기본형 : 
		//inputstream(장치 | 키보드,파일,네트워크 프로그램으로 입력) 1바이트씩 보내주는 성질
		//inputstreamreader 장치 -> 프로그램 2byte씩
		//bufferedreader 1String - line 빨대 크기 Up! 
		//OutputStream : 프로그램의 결과를 장치로 출력
		//OutputStreamWriter : 2byte씩
		//BufferedWriter : 1String -Line
		
		//개조형 (특수목적에 맞게) :
		//PrintStream (OutputStream 개조) - 쓰기 편하게 유용한 메소드를 추가
		//FileReader (InputStreamReader 개조) - 파일에서 데이터를 읽어오기 편하게
		//FileWriter (OutputStreamWriter 개조)
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 : ");
		String cmt = k.next();
		
		System.out.println("----------");
		//FileWriter
		//		프로그램 -> 파일(OutputStreamWriter의 개조형)
		//		파일이 없으면 만들어 주기도 함
		//		폴더는 안만들어줌
		//		Linux의 경로는 /로 설정하고 Window는 \\로 경로 설정한다 / 로도 가능하다
		
		//fw위에 bw를 덧씌운 상태
		//연관된 것들 중에서 하나만 닫으면 다 처리
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("C:\\Users\\wtime\\Desktop\\java\\HHHHH.txt", true);
			
			//한 바이트씩 입출력하기 보다는 "버퍼"를 이용해서 한번에 여러 바이트를 입출력하는 것이 빠름
			// 버퍼 => 대부분의 입출력 작업에서 사용 버퍼는 CPU와 HDD사이의 공간
			//버퍼링 -> 데이터를 버퍼로 저장하는 동작
			//		=>실행성능 향상 시킬 수 있음 
			bw = new BufferedWriter(fw);
			bw.write(cmt + "\r\n");
			bw.write("kkkkkkkkkk");
			bw.flush();// 용량이 다 안채워져도 강제적으로 내보내기.(모든 데이터 다 보내기)
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
