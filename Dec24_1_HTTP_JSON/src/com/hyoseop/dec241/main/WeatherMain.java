package com.hyoseop.dec241.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.hyoseop.dec224.httpclient.HSHTTPclient;

//AJAX - JavaScript에서 XML파싱
//		-> XML 많이 안쓰임...
//		-> JavaScript에 친화된 형태 없을까..?

//XML : 주고 받는게 약속된 형태

//JSON(javascript object notation)
//		DB에 있는 데이터를 JavaScript형태로 표현한 것.
//		XML보다는 훨~~~씬 좋다(압도적)

//api.openweathermap.org/data/2.5/weather?q=Paris&appid=42008a8c8e7402a3fc9d3b1a7df8fee9

//크롬 웹스토어 -Jsonviewer다운
//Java배열 : {1, 2, 3}
//JS배열 : [1, 2, 3]
//Java객체 : Dog d = new Dog();
//			d.getName("마루");
//			d.getAge(2);
//JS객체 : {name : "마루", age : 2}

public class WeatherMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("City : ");
			String cityname = k.nextLine();
			cityname = URLEncoder.encode(cityname, "utf-8");
			System.out.println(cityname);
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address += "?q="+ cityname;	//도시이름 넣기
			address += "&appid=42008a8c8e7402a3fc9d3b1a7df8fee9";	//API key넣기
			address += "&units=metric"; // 섭씨온도로 출력
			address += "&lang-kr";
			System.out.println(address);
			InputStream is = HSHTTPclient.download(address);
			String str = HSHTTPclient.convert(is, "utf-8");
			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			//객체? 배열? - 괄호 모양을 보고 판단
			// [ :배열
//			JSONArray ja = (JSONArray)jp.parse(str);
//			System.out.println(ja);
			// { :객체
			JSONObject jo = (JSONObject)jp.parse(str);
			System.out.println(jo);
			
			JSONObject sys = (JSONObject)jo.get("sys");
			System.out.println(sys);
			String country = (String)sys.get("country");
			System.out.println(country);
			
			String name = (String) jo.get("name");
			System.out.println(name);
			
			JSONArray ja2 = (JSONArray) jo.get("weather");
			JSONObject jo2 = (JSONObject) ja2.get(0);
			String description = (String) jo2.get("description");
			//기온 체감온도 최저기온 최고기온 기압 습도
			
			//기온 + 체감온도
			JSONObject ja3 = (JSONObject) jo.get("main");
			double temp = (double)ja3.get("temp");
			double feel_like = (double)ja3.get("feels_like");			
			double temp_min = (double)ja3.get("temp_min");			
			double temp_max = (double)ja3.get("temp_max");			
			long pressure = (long)ja3.get("pressure");			
			long humidity = (long)ja3.get("humidity");			
			
			System.out.println(temp);
			System.out.println(feel_like);
			System.out.println(temp_min);
			System.out.println(temp_max);
			System.out.println(pressure);
			System.out.println(humidity);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
