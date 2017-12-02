package com.darwinit.advent;

public class Additioner {
	
	private boolean useOnlyNext=true;

	public long compute(String value) {
		char c1=value.charAt(0);
		long acc=0;
		
		for(int i = 0; i < value.length(); i++)
		{
			char c2 = value.charAt((i+getDigitOffset(value.length())) % value.length());
			if(c1==c2) {
				acc+=Character.getNumericValue(c1);
			}
			c1=value.charAt((i+1) % value.length());
		}
		
		return acc;
	}

	private int getDigitOffset(int length) {
		if(isUseOnlyNext())
			return 1;
		else 
			return length/2;
	}

	public boolean isUseOnlyNext() {
		return useOnlyNext;
	}

	public void setUseOnlyNext(boolean useOnlyNext) {
		this.useOnlyNext = useOnlyNext;
	}
	
}
