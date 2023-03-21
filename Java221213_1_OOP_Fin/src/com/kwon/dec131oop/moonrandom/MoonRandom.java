package com.kwon.dec131oop.moonrandom;

import java.util.Random;

public class MoonRandom extends Random {
	@Override
	public int nextInt(int bound) {
		
		int a = super.nextInt(bound);
		return (a % 2 == 1) ? nextInt(bound) : a;
		
	}
}
