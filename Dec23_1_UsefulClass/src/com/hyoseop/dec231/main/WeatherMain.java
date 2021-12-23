package com.hyoseop.dec231.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.hyoseop.dec224.httpclient.HSHTTPclient;

public class WeatherMain {
	public static void main(String[] args) {
		System.out.println("<대한민국 기상청>");
		try {
			String address = "http://www.kma.go.kr/wid/"
					+ "queryDFSRSS.jsp?zone=4128556000";
			
			InputStream is = HSHTTPclient.download(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is,"utf-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			while (type!=XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					System.out.println(tagName);
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("category")) {
						System.out.println(xpp.getText());
					} else if (tagName.equals("hour")) {
						System.out.println(xpp.getText());
					} else if (tagName.equals("temp")) {
						System.out.println(xpp.getText());
					} else if (tagName.equals("wfKor")) {
						System.out.println(xpp.getText());
					} else if (tagName.equals("wdKor")) {
						System.out.println(xpp.getText());
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
 			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
