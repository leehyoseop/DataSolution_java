package com.hyoseop.dec224.main;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Example {
	public static void main(String[] args) {
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			HttpGet hg = new HttpGet("https://www.naver.com");
			
			HttpResponse hr = dhc.execute(hg);
			HttpEntity he = hr.getEntity();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
