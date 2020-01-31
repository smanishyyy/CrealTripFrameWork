package com.java.interview;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fabinocci {
	
	public static void main(String arg[])
	
	
	{
		try
		{
		int a=0,b=1,nextTerm = 0,n=10;
		System.out.print(a);
		System.out.print(b);
		for(int i=0;i<n;i++)
		{
			nextTerm=a+b;
			System.out.print(nextTerm);	
	        a=b;
			b=nextTerm;
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int i=10/0;
		System.out.println("Exe");
		throw new InterruptedException();
	
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Null");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Null");	
		}
		catch(IOException e)
		{
			System.out.println("hhhhh");
		}
		catch(InterruptedException e)
		{
			System.out.println("Interupted");
		}
		System.out.println("Last");
		
	}

	

}
