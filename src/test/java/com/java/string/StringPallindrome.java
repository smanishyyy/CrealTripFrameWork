package com.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPallindrome {
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static String str,rev=" ",temp;

	public static void main(String arg[]) throws IOException
	{
		System.out.println("Enter a string");
		
		str=br.readLine();
		temp=str;
	char st[]=	str.toCharArray();
	int len=st.length;
	System.out.println("Length : "+len);
	for(int i=len-1;i>=0;i--)
    {
		rev=rev+st[i];
	
	}
	System.out.println("Reverse string is : "+rev);
	checkPallindrome(temp.trim(),rev.trim());
	}

	private static void checkPallindrome(String temp2, String rev2) {

		
		
		if(temp2.equalsIgnoreCase(rev2))
		{
			System.out.println("Pallindrome");	
		}
		else
		{
			System.out.println("Not pallindrome");		
		}
		
	}
	

}
