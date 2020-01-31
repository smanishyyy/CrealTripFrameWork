package com.java.interview;

public class PrintAllPrime {
//	public static int count = 0, n = 2;
//	public static boolean flag;

public static void main(String arg[])
{
	int count = 0,n=2;
	boolean flag=false;
	int num=10;
		
 while (count != num) {
	
		flag = true;
		//System.out.println("mm"+n);
		//System.out.println("mm"+Math.sqrt(n));
	for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n % i == 0) {//
				flag = false;
				
				break;
			}
		}
		if (flag) {
			count++;
			System.out.println(n);
		}
		n++;
	}
	
	
}
}
