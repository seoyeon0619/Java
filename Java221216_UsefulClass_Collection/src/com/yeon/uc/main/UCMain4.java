package com.yeon.uc.main;

import java.util.ArrayList;
import java.util.HashSet;

import com.yeon.uc.student.Student;

public class UCMain4 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("c");
		hs.add("a");
		hs.add("a");
		hs.add("a");
		hs.add("b");
		System.out.println(hs.size());

		ArrayList<String> al = new ArrayList<>(hs);
		for (String string : al) {
			System.out.println(string);
		}

		System.out.println("-----");
		HashSet<Student> students = new HashSet<>();
		Student s = new Student("박길동", 0, 10, 10);
		students.add(s);
		students.add(s);
		// 중복
		students.add(new Student("홍길동", 100, 90, 80));
		students.add(new Student("김길동", 80, 90, 70));
		students.add(new Student("최길동", 97, 78, 50));
		students.add(new Student("최길동", 97, 78, 50));
		// 참조형 객체 : 중복 아님
		System.out.println(students.size());
		System.out.println("-----");
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);
		al2.add(20);	al2.add(20);	al2.add(20);
		al2.add(333);
		al2.add(5648);
		al2.add(43);	al2.add(43);	al2.add(43);
		al2.add(7982);
		
		HashSet<Integer> hs2 = new HashSet<>(al2);
		al2 = new ArrayList<>(hs2);
		for (Integer integer : hs2) {
			System.out.println(integer);
		}

	}
}
