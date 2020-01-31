package com.java.string;

public class StringStringBfrPerform {
	
	
	public static void main(String arg[])
	{
	long startTime=	System.currentTimeMillis();
	concatWithString();
	System.out.println("Time taken by concating with string : "+(System.currentTimeMillis()-startTime)+"ms");
	long startTime2=	System.currentTimeMillis();
	concatWithStringBuuffer();
	System.out.println("Time taken by concating with string buffer : "+(System.currentTimeMillis()-startTime2)+"ms");
	}

	private static StringBuffer concatWithStringBuuffer() {
		StringBuffer bfr=new StringBuffer("Java");
		for(int i=0;i<10000;i++)
		{
			bfr.append("T point");
		}
		return bfr;
		
	}

	private static String concatWithString() {
		String s="Java";
		for(int i=0;i<10000;i++)
		{
			s=s+"T point";
		}
		return s;
		
	}

}
