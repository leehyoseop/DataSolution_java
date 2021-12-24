package com.hyoseop.dec241.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.hyoseop.dec224.httpclient.HSHTTPclient;

//2c1230ee75fe6327086ebe591d00b2b2
//GET /v2/local/search/keyword.{FORMAT} HTTP/1.1
//Host: dapi.kakao.com
//Authorization: KakaoAK {REST_API_KEY}
public class LocSearchMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.println("검색 : ");
			String search = k.nextLine();
			search = URLEncoder.encode(search, "utf-8");
			System.out.println(search);
			
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + search;
			//"37.52073993286455, 127.08225695940139" Y.X 좌표
			address += "&x=127.082256&y=37.520739"; //(기준점의 좌표)
			address += "&radius=5000";	//(주변반경거리)
			address += "&sort=distance";
			
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection)u.openConnection();
			
//			huc.addRequestProperty("Authorization", "KakaoAK 2c1230ee75fe6327086ebe591d00b2b2");
//			InputStream is = huc.getInputStream();
//			String str = HSHTTPclient.convert(is, "utf-8");
//			System.out.println(str);
			
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK 2c1230ee75fe6327086ebe591d00b2b2");
			InputStream is = HSHTTPclient.download(address, headers);
			String str = HSHTTPclient.convert(is, "utf-8");
			System.out.println(str);
			
			//총 검색 결과 수
			//현재페이지 검색 결과 수
			//주소
			//전화번호
			//상호명
			//거리
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject)jp.parse(str);
			JSONObject jo2 = null;
			String address_name = null;
			String phone = null;
			String place_name = null;
			String distance = null;
			
			JSONArray ja = (JSONArray) jo.get("documents");
			for (int i = 0; i < ja.size(); i++) {
				jo2 = (JSONObject) ja.get(i);
				address_name = (String) jo2.get("address_name");
				phone = (String) jo2.get("phone");
				place_name = (String) jo2.get("place_name");
				distance = (String) jo2.get("distance");
				System.out.println(address_name);
				System.out.println(phone);
				System.out.println(place_name);
				System.out.println(distance);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
