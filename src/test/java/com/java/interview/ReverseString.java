package com.java.interview;

public class ReverseString {


	public static void main(String arg[])
	{
		String rev="";
		String str="abcdcba";	
	char arr[]=str.toCharArray();
	System.out.println(arr.length);
	for(int i=arr.length-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
	checkIfPallindrome(str,rev);
	}

	private static void checkIfPallindrome(String str, String rev) {
	
		if(str.trim().equals(rev.trim()))
		{
			System.out.println("Pallindrome");	
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}
	
	

}
