package com.hyoseop.dec224.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

//통신
//	HTTP - 클라이언트가 요청을 하면 서버가 그 요청에 맞게 응답
//	Socket통신 - 실시간 통신 (내 읜지와는 상관없이 강제전송기능)

//Java에는 HTTPClient기능이 없었음->개발을 했어야 했는데...ㅠㅠ
//다른 개발자가 개발해서 공개를 해놨음^_^
//남이 만들어 놓은거 잘 쓰면 된다!!!

//apache.org - httpcomponents - download 4.5.13.zip(binary)

public class HMain1 {
	//서버에 접속
	
	public static void main(String[] args) {
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// 요청 - GET(기본) or POST
			HttpGet hg = new HttpGet("https://www.naver.com");
			// 응답
			System.out.println(hg);
			HttpResponse hr = dhc.execute(hg);
			System.out.println(hr);
			// 응답 내용
			HttpEntity he = hr.getEntity();
			System.out.println(he);
			// 그 내용을 가져갈 수 있는 빨대
			InputStream is = he.getContent();
			
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
//			String line = null;
//			while ((line = br.readLine())!= null) {
//				System.out.println(line);
//			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
