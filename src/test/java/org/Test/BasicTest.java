package org.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");

	}

	@Before
	public void before() {
		System.out.println("Before");

	}

	@After
	public void after() {
		System.out.println("After");

	}
	@Test
	public void test1() {
		System.out.println("Test1");

	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");

	}
	
//	@Test
//	public void Test3() {
//		System.out.println("Test3");
//
//	}
}
