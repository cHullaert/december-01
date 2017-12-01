package com.darwinit.advent;

public class Additioner {

	public long compute(String value) {
		char c1=value.charAt(0);
		long acc=0;
		
		for(int i = 0; i < value.length(); i++)
		{
			char c2 = value.charAt((i+1) % value.length());
			if(c1==c2) {
				acc+=Character.getNumericValue(c1);
			}
			c1=c2;
		}
		
		return acc;
	}

}
