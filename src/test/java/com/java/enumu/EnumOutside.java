package com.java.enumu;
//Enum declaration can be done outside a Class or inside a Class but not inside a Method.
enum Color
{
	RED,GREEN,BLUE;
}
public class EnumOutside {
	public static void main(String arg[])
	{
		Color c=	Color.RED;
		System.out.println(c);
	}

}
