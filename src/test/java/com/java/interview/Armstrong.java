package com.java.interview;

public class Armstrong {
public static void main(String arg[])
{
	int i=372,temp,rem,sum = 0;
	temp=i;
	
	int w=(int)888.8;
	byte x =(byte)100L;
	long y=(byte)100;
	String str="Hello";
	String s=str.substring(0,4);
	System.out.println(s);
	while(i>0)
	{
		rem=i%10;
		sum=sum+rem*rem*rem;
		i=i/10;
		
	}
	System.out.println(sum);
	if(temp==sum)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
}
}
