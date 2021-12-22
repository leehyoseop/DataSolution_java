package com.hyosoep.dec222.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
//통신
//		일반적인 통신 - HTTP통신
//		실시간 통신 - Socket통신

//서버 - 서비스를 제공하는 컴퓨터
//클라이언트 - 서비스를 이용하는 컴퓨터
//IP주소 - 네트워크 통신을 할 떄 사용하는 전화번호 샅은 
//	확인 : 시작 - cmd -ipconfig
//포트번호 - 무슨 서비스 이용하러...
//		0~65535
//		
public class SSMain {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			//소켓서비스 시작
			ss = new ServerSocket(8899); //상대의 포트번호
			System.out.println("기다리는중...");
			
			Socket s = ss.accept();
			System.out.println("연결됨...!");
			
			Scanner k = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			JFrame jf = new JFrame();
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(500, 500);
			jf.setVisible(true);
			Thread t = new Thread() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					super.run();
					while (true) {
						try {
							jta.append("진아 =>"+br.readLine() + "\n");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
			t.start();
			while (true) {
				System.out.println("나 =>");
				String msg = k.next();
				bw.write(msg+"\n");
				jta.append("나 =>" + msg + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				ss.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
