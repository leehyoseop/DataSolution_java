package com.hyoseop.dec224.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

//Java에 HTTP통신기능이 생겼음! -> HTTPClient가 필요 없음
public class HMain2 {
	public static void main(String[] args) {
		try {
			String address = "https://www.naver.com";
			URL u = new URL(address);
			HttpsURLConnection  huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
