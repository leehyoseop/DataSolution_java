package com.hyoseop.jan051.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.hyoseop.db.manager.HyoseopDBManager;
import com.hyoseop.dec224.httpclient.HSHTTPclient;
import com.hyoseop.jan041.main.Air;


public class WeatherDAO {
	//1. json으로 가져오기
	public static ArrayList<Weather> getWeather() {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("City : ");
			String cityname = k.next();
			Weather w = new Weather();
			ArrayList<Weather> weathers = new ArrayList<Weather>();
			cityname = URLEncoder.encode(cityname, "utf-8");
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address += "?q="+ cityname;	//도시이름 넣기
			address += "&appid=42008a8c8e7402a3fc9d3b1a7df8fee9";	//API key넣기
			address += "&units=metric"; // 섭씨온도로 출력
			address += "&lang-kr";
			
			InputStream is = HSHTTPclient.download(address);
			String str = HSHTTPclient.convert(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			
			JSONObject jo = (JSONObject)jp.parse(str);
			
			String name  = (String) jo.get("name");
			
			w.setName(name);
			JSONObject ja1 = (JSONObject)jo.get("main");
			w.setTemp(new BigDecimal((ja1.get("temp").toString())));
			w.setPressure(new BigDecimal((ja1.get("pressure").toString())));
			w.setHumidity(new BigDecimal((ja1.get("humidity").toString())));
			weathers.add(w);
			
			return weathers;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	//2.DB에 저장하기
	public static String writeWeather(Weather w) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = HyoseopDBManager.connect();
			String sql = "insert into Weather values(weather_seq.nextval, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, w.getName());
			pstmt.setBigDecimal(2, w.getTemp());
			pstmt.setBigDecimal(3, w.getPressure());
			pstmt.setBigDecimal(4, w.getHumidity());
			if (pstmt.executeUpdate() >= 1) {
				return "Success!";
			}
			return "";
		} catch (Exception e) {
			// TODO: handle exception
			return "Fail";
		}
	}
	//3.DB에서 가져오기
	public static ArrayList<Weather> getMyWeather() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = HyoseopDBManager.connect();
			String sql = "select * from Weather";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<Weather> weathers = new ArrayList<Weather>();
			Weather w = null;
			while (rs.next()) {
				w = new Weather();
				w.setNo(rs.getInt("no"));
				w.setName(rs.getString("name"));
				w.setTemp(rs.getBigDecimal("temp"));
				w.setPressure(rs.getBigDecimal("pressure"));
				w.setHumidity(rs.getBigDecimal("humidity"));
				weathers.add(w);
			}
			System.out.println(weathers);
			return weathers;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		} finally {
			HyoseopDBManager.close(con, pstmt, rs);
		}
	}
	//4.파일에 넣기
	public static void writeWeatherToFile(ArrayList<Weather> weathers) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\wtime\\Desktop\\java\\WeatherData.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,kk,mm");
			for (Weather w : weathers) {
				bw.write(w.getNo() + ",");
				bw.write(w.getName() + ",");
				bw.write(w.getTemp() + ",");
				bw.write(w.getPressure() + ",");
				bw.write(w.getHumidity() + "\n");
				bw.flush(); 
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
