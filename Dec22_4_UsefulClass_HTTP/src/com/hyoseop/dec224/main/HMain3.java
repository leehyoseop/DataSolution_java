package com.hyoseop.dec224.main;

import java.io.InputStream;

import com.hyoseop.dec224.httpclient.HSHTTPclient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = HSHTTPclient.download("https://naver.com");
			
			String result = HSHTTPclient.convert(is, "utf-8");
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
