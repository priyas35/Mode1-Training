package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	

	@Test
	public void testDiv() {
		Data objdata=new Data();
	    assertEquals(2, objdata.div(5, 2));
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void testDivEx() {
		Data objdata=new Data();
	    objdata.div(5,0);
		
	}
	
	
	@Test
	public void testGetProperty() {
		Data objdata=new Data();
		assertNotNull(objdata.getpropertyTest("priya"));
		assertNull(objdata.getpropertyTest("hema"));
		
		
	}
	
	@Test
	public void testsayHello() {
		Data objdata=new Data();
		assertEquals("welcome to junit", objdata.sayHello());
	}

	@Test(expected=NullPointerException.class)
	public void testNullEx() {
		Data objdata=null;
		assertEquals(5, objdata.sum(3,2));
	}
	@Test
	public void testsum() {
		Data objdata=new Data();
		assertEquals(4, objdata.sum(2,2));
		assertEquals(4, objdata.sum(1,3));
	}
	
	@Test
	public void testmax3() {
		Data objdata=new Data();
		assertEquals(5, objdata.max3(5,1,3));
		assertEquals(5, objdata.max3(1,5,3));
		assertEquals(5, objdata.max3(1,3,5));
	}
	
	
	@Test
	public void testeven() {
		Data objdata=new Data();
		assertTrue(objdata.even(4));
		assertFalse(objdata.even(1));
	}
	
	@Test
	public void testminarray() {
		Data objdata=new Data();
		int[] a=new int[]{1,2,3,4,5};
		int[] a1=new int[]{11,2,3,4,1};
		assertEquals(1, objdata.minArray(a1));
	}




}
