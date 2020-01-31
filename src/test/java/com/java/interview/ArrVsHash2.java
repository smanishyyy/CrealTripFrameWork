package com.java.interview;

import java.util.HashMap;

public class ArrVsHash2 {
	public static void main(String arg[])
	{
		int arr1[]= {1,22,3,44,55,66,77};
		int arr2[]={11,2,33,4,5,6,7};
		
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			hs.put(arr1[i], arr2[i]);
		}
		System.out.println(hs);
	}
}
