package com.darwinit.advent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class December01Test {
	
	private Additioner additioner=new Additioner();

	@Test
	public void given1122WhenIComputeThenReturn3() {
		long value=additioner.compute("1122");
		
		assertEquals(3, value);
	} 
	
	@Test
	public void given1111WhenIComputeThenReturn4() {
		long value=additioner.compute("1111");
		
		assertEquals(4, value);
	
	}
	
	@Test
	public void given1234WhenIComputeThenReturn0() {
		long value=additioner.compute("1234");
		
		assertEquals(0, value);
	}
	
	@Test
	public void given91212129WhenIComputeThenReturn9() {
		long value=additioner.compute("91212129");
		assertEquals(9, value);
	}
}
