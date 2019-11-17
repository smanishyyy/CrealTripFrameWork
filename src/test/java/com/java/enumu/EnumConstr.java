package com.java.enumu;
//enum and constructor :
//enum can contain constructor and it is executed separately for each enum 
//constant at the time of enum class loading.
//We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
//enum and methods :
//enum can contain concrete methods only i.e. no any abstract method
enum Color3
{
RED,PINK,GREEN;
	private Color3()
	{
		System.out.println("Constructor called for : " + 
		        this.toString());
	}
	public void ColorInfo()
	{
		 System.out.println("Universal Color");
	}
	
}
public class EnumConstr {
public static void main(String arg[])
{
	Color3 c=Color3.GREEN;
	System.out.println(c);
	c.ColorInfo();
}
}
