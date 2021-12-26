package com.shiv.junit;

public class MathOps {
	
	//Varargs method
	int add(int... a) {
		int add = 0;
		for (int i : a) {
			add += i;
		}
		return add;
	}

	//Varargs method
	int substract(int a, int b) {
		int num = 0;
		num = a - b;
		return num;
	}
	
	int multiply(int a , int b){
		return a * b;
	}

}
