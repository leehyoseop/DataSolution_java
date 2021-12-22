package com.hyosoep.dec222.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SSMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss =new ServerSocket();
			Socket s = ss.accept();
			System.out.println("기다리는중...");
			Scanner k =  new Scanner(System.in);
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				System.out.print("효섭] ");
				String msg = k.next();
				bw.write(msg + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
			try {
				ss.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
