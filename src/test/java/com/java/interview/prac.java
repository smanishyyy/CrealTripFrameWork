package com.java.interview;

public class prac {

	
	@SuppressWarnings("unused")
	public static void main(String arg[])
	{
		int a=0;
		int count =0;
		if(((5<7||(++count<10)) || a++<10))
		{
			
				a=a+1;
				System.out.println("Out : "+a);
		}
		if((6>8 )^ false)
		{
		
				a=a+10;
				System.out.println("Out1 : "+a);
		}
		if(!(a>1)&& +count>1)
		{
			System.out.println("Out3");
			a=a+100;
		}
		System.out.println(a+ " "+count);
		
		System.out.println(++count);
//		System.out.println(++count);
//		System.out.println(++count);
		System.out.println(count);
		System.out.println(--count);
		System.out.println(count);
		
		
	}
}
