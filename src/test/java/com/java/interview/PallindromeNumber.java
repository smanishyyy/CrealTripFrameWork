package com.java.interview;

public class PallindromeNumber {

	
	public static void main(String arg[])
	{
		int j=123454321,rem = 0,sum=0,temp;
		temp=j;
		while(j>0)
		{
			rem=j%10;
			sum=sum*10+rem;
			j=j/10;
			System.out.println(j);
		}
		System.out.println(sum);
		Integer in=Integer.valueOf(sum);
		Integer in2=Integer.valueOf(temp);
		
		compare(in,in2);
	}

	private static void compare(Integer in, Integer in2) {
	int i=	in.compareTo(in2);
	if(i==0)
	{
		System.out.println("Pallindrome");
	}
	else
	{
		System.out.println("Not Pallindrome");
	}
		
	}
}
