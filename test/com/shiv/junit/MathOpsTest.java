package com.shiv.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOpsTest {
	MathOps methOps = new MathOps();
	
	@Before
	public void before(){
		System.out.println("Before method executed..!!");
	}
	
	@After
	public void after(){
		System.out.println("After method executed..!!");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass method executed..!!");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass method executed..!!");
	}

	@Test
	public void sumWith3Numbers() {
		System.out.println("sumWith3Numbers method executed..!!");
		assertEquals(6, methOps.add(1, 2, 3));
	}

	@Test
	public void sumWith4Numbers() {
		System.out.println("sumWith4Numbers method executed..!!");
		assertEquals(10, methOps.add(1, 2, 3, 4));
	}

	@Test
	public void substractionTest() {
		System.out.println("substractionTest method executed..!!");
		assertEquals(2, methOps.substract(5, 3));
	}
	
	@Test
	public void multiplyTest(){
		System.out.println("multiple2Numbers method executed..!!");
		assertEquals(60, methOps.multiply(20,3));
	}

}
