package com.hyoseop.dec224.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HSHTTPclient {
	//서버에 요청해서 다운받기
	public static InputStream download(String address) throws IOException{
		URL u = new URL(address);
		if (address.startsWith("https")) {
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			return huc.getInputStream();
		} else {
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			return huc.getInputStream();
		}
	}
	
	//다운받은걸 String으로 바꾸기
	public static String convert(InputStream is, String charset) throws IOException{
		InputStreamReader isr = new InputStreamReader(is, charset);
		BufferedReader br = new BufferedReader(isr);\
		
		
		String line = null;
		StringBuffer sb = new StringBuffer();
		
		while ((line = br.readLine())!= null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
