package com.kwon.dec132oop.star;

import com.kwon.dec132oop.human.Human;

public class Planet {
	private String name;
	private int size;
	private boolean visiable;
	Human human;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Planet(String name) {
		super();
		this.name = name;
	}

	public Planet(String name, int size, boolean visiable) {
		super();
		this.name = name;
		this.size = size;
		this.visiable = visiable;
	}
	

	public Planet(String name, int size, boolean visiable, Human human) {
		super();
		this.name = name;
		this.size = size;
		this.visiable = visiable;
		this.human = human;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public boolean isVisiable() {
		return visiable;
	}


	public void setVisiable(boolean visiable) {
		this.visiable = visiable;
	}
	
	public void add(Human h) {
		System.out.printf("%s에 %s 입주완료\n", name, h.getName());
	}

	public void print() {
		System.out.println(name);
		System.out.println(size);
		System.out.println(visiable);
	}
}
