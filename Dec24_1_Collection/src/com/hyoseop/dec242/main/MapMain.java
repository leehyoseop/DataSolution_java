package com.hyoseop.dec242.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Map 계열
//		가변사이즈가 존재
//		<key, value>
//		Key값도 지정
//		순서개념 X
//
public class MapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("아메리카노", 4000);
		hm.put("녹차라떼", 5000);
		hm.put("레몬에이드", 6000);
		hm.put("녹차라떼", 7000);	//녹차라떼 key값이 같기 때문에 제일 마지막에 저장된 value값으로 수정됨
		
		System.out.println(hm.get("녹차라떼"));
		Set<String> k = hm.keySet();
		for (String string : k) {
			System.out.println(string);
			System.out.println(hm.get(string));
		}
		
		//Java의 주력은 Arraylist
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(123);
		a1.add(1011);
		a1.add(2352315);
		a1.add(1);
		a1.add(11312312);
		a1.add(1);
		a1.add(123333);
		
		//중복을 없애고 싶을때 
		HashSet<Integer> hs2 = new HashSet<Integer>(a1);
		a1 = new ArrayList<Integer>(hs2);
		//중복제거 하지만 순서가 뒤죽박죽된다.
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		//정렬한 상태로 출력하고 싶다면
		a1.sort(c);
		for (Integer integer : a1) {
			System.out.println(integer);
		}
	}
}
