package com.yeon.uc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UCMain5 {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("서울", -10.5);
		hm.put("수원", -13.5);
		hm.put("인천", -9.5);
		hm.put("서울", -1.5);
		System.out.println(hm.get("서울"));

		// 키가 있는지 boolean으로 알려줌
		System.out.println(hm.containsKey("인천"));

		// 맵에서 키를 셋으로
		Set<String> s = hm.keySet();
		ArrayList<String> al = new ArrayList<>(s);
		for (String string : al) {
			System.out.println(string);
			System.out.println(hm.get(string));
		}
	}
}
