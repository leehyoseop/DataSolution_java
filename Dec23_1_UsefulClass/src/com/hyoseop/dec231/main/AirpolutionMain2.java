package com.hyoseop.dec231.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.hyoseop.dec224.httpclient.HSHTTPclient;


//미세먼지 -> 파싱 -> 값들을 txt 파일에 담기
//yyyy-MM-dd-a-hh E
//측정구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
//날짜, 측정구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
public class AirpolutionMain2 {
	public static void main(String[] args) {
		Date now  = new Date();
		String year = Integer.toString(now.getYear()+1900);
		String month = Integer.toString(now.getMonth());
		String date = Integer.toString(now.getDate());
		String hour = Integer.toString(now.getHours());
		String[] stringday = {"일", "월", "화", "수", "목", "금", "토"};
		//System.out.println(stringday[now.getDay()]);
		//FileOutputStream fos = null;
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		String nowStr = sdf.format(now);
		BufferedWriter bw = null;
		try {
			String address = "http://openAPI.seoul.go.kr:8088/"
					+ "4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/"
					+ "1/25/";
			FileWriter fw = new FileWriter("C:\\Users\\wtime\\Desktop\\"
					+ "java\\AirPolution.txt", true);
			
			InputStream is = HSHTTPclient.download(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			int type = xpp.getEventType();
			String tagName = null;
			
			bw = new BufferedWriter(fw);
			
			while (type!=XmlPullParser.END_DOCUMENT) {
				
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					//System.out.println(tagName);
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						System.out.println(xpp.getText());
						bw.write(year+"-"+month+"-"+date+"-"+hour+"시"+"-"+stringday[now.getDay()]+",");
						bw.write(xpp.getText()+",");
					} else if (tagName.equals("PM10")) {
						System.out.println(xpp.getText());
						bw.write(xpp.getText()+",");
					} else if (tagName.equals("PM25")) {
						System.out.println(xpp.getText());
						bw.write(xpp.getText()+",");
					} else if (tagName.equals("O3")) {
						System.out.println(xpp.getText());
						bw.write(xpp.getText()+",");
					} else if (tagName.equals("IDEX_MVL")) {
						System.out.println(xpp.getText());
						bw.write(xpp.getText()+"\n");
						bw.flush();
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
 			}
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
