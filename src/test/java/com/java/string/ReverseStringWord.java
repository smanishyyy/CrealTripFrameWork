package com.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWord {

	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static String str,rev=" ";
	public static void main(String arg[]) throws IOException
	{
		System.out.println("Enter a string");
		
		str=br.readLine();
	char st[]=	str.toCharArray();
	int len=st.length;
	System.out.println("Length : "+len);
	for(int i=len-1;i>=0;i--)
    {
		rev=rev+st[i];
	
	}
	System.out.println("Reverse string is : "+rev);
	}
	
}
