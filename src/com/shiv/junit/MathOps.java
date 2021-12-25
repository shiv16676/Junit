package com.shiv.junit;

public class MathOps {

	int add(int... a) {
		int add = 0;
		for (int i : a) {
			add += i;
		}
		return add;
	}

	int substract(int a, int b) {
		int num = 0;
		num = a - b;
		return num;
	}

}
