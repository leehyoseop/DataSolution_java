package com.hyoseop.dec242.main;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain {
//ArrayList
//	요소를 인덱스로 사용하는 것은 배열과 유사
//배열 : 사이즈가 고정 -> 데이터의 수가 배열의 크기보다 많아지면 저장이 불가능
//ArrayList : 저장되는 데이터의 수에 따라서 크기가 자동적으로 변경
//		요소가 가득차게 되면 ArrayList의 크기를 동적으로 증가시키고 그 반대도 마찬가지로...
//		자료형을 섞어서 데이터 넣는게 가능
//<자료형> => generic
//		자료형을 고정하는 역할
//		클래스명(자료형의 객체형) 값을 넣으면...
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add("이브");
		test.add(1224);
		test.add("크리스마스");
		test.add(12.25);
		for (Object object : test) { //자료형이 통일되지 않아서 object라는게 헷갈림..
			System.out.println(object);
		}
		
		ArrayList<String> a1 = new ArrayList<String>();
		//al.add("귤");
		//al.add(1);
		
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		a12.add(new Integer(100));
		a12.add(50);
		
		System.out.println(a12.get(0));
		System.out.println(a12.size());
		a12.add(0, null); //1번자리에 90 넣기 뒤에꺼는 밀린다.
		a12.set(0, null); //2번자리를 0으로 바꾸기
		a12.remove(0); //0번자리에 있는 값 지우기
		
		a1.add("감");
		a1.add("사과");
		a1.add("수박");
		a12.add(400);
		a12.add(2173);
		a12.add(300);
		
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		a1.sort(c);
		for (String s : a1) {
			System.out.println(s);
		}
		Comparator<Integer> c2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);//오름차순
			//	return o2.compareTo(o1);//내림차순
			}
		};
	}
}
