package com.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CatitaliseWord {
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static String str,rev="";
	public static char store;
	public static char arr[];
  
	public static LinkedList<String> ls=new LinkedList<String>() ;
	public static void main(String arg[]) throws IOException
	{
		System.out.println("Enter a string");
		
		str=br.readLine();
		StringTokenizer str2=new StringTokenizer(str," ");
		while(str2.hasMoreTokens())
		{
			
			ls.add(str2.nextToken());
		}
		for(String s:ls)
		{
		
	arr=s.toCharArray();
			for(int i=0;i<=arr.length-1;i++)
			{
				if(i==0)
				{
					store=	Character.toUpperCase(arr[i]);
					arr[i]	=store;
					
				}
				rev=rev+arr[i];
				
			}
			
			rev=rev+" ";
			
			
		}

		System.out.print(rev);	
		System.out.println();
		System.out.println("Upper case : "+rev.toUpperCase());
		System.out.println("Lower case : "+rev.toLowerCase());
	
	}
}
