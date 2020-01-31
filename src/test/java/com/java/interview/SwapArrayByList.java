package com.java.interview;

import java.awt.List;
import java.util.*;

import org.apache.commons.lang3.ArrayUtils;

public class SwapArrayByList {
public static void main(String arg[])
{
	int arr1 []= {1,2,3,4,5,6};
	int arr2 []= {1,2,3,4};
	Integer arr[]=ArrayUtils.toArray(ArrayUtils.toObject(arr1));
	int[] arr3=ArrayUtils.toPrimitive(arr);
	for(int p:arr3)
	{
	System.out.println(p);	
	}

Collection<Integer> al =  Arrays.asList(ArrayUtils.toObject(arr3));
System.out.println(al);	
LinkedList<Integer> al2=new LinkedList<Integer>(al);
System.out.println(al2);
Integer arr5[]=al2.toArray(new Integer[al2.size()]);
int arr6[]=ArrayUtils.toPrimitive(arr5);


}
}
