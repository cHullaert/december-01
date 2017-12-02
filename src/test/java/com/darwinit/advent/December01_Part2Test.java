package com.darwinit.advent;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class December01_Part2Test {
	
	private Additioner additioner=new Additioner();

	@Before
	public void prepareWay() {
		additioner.setUseOnlyNext(false);
	}

	@Test
	public void given1212WhenIComputeThenReturn6() {		
		long value=additioner.compute("1212");		
		assertEquals(6, value);
	} 

	@Test
	public void given1221WhenIComputeThenReturn0() {		
		long value=additioner.compute("1221");		
		assertEquals(0, value);
	}

	@Test
	public void given123425WhenIComputeThenReturn4() {		
		long value=additioner.compute("123425");		
		assertEquals(4, value);
	}
	
	@Test
	public void given123123WhenIComputeThenReturn12() {		
		long value=additioner.compute("123123");		
		assertEquals(12, value);
	}
	
	@Test
	public void given12131415WhenIComputeThenReturn4() {		
		long value=additioner.compute("12131415");		
		assertEquals(4, value);
	}
	
}
