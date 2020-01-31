package com.java.interview;

public class PrintStar {
	
//	public static void main(String arg[])
//	{
//		for(int i=0;i<=5;i++)
//		{
//		for(int j=0;j<=i;j++)
//		{
//			System.out.print("*"+" ");
//		}
//		System.out.println();
//		}
//		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * * 	
//		
//		
//	}
	
	
	public static void main(String arg[])
	{
		for(int i=0;i<=5;i++)
			{
			for(int j=2*(5-i)-1;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");	
			}
			for(int j=0;j<=i;j++)
				{
				if(j==0)
				{
					continue;
				}
				System.out.print("* ");
				}
		
			System.out.println();
			}
		
	}
	
}



