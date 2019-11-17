package com.java.enumu;

import org.apache.poi.util.SystemOutLogger;

enum Color2
{
	RED,BLUE,PINK;
}
public class EnumMethod {
	
	public static void main(String arg[])
	{
		Color2[] cl=Color2.values();	
		for(Color2 c:cl)
		{
		System.out.println(c +" at index "+c.ordinal());
		}
		System.out.println(Color2.valueOf("RED"));
	}

}
