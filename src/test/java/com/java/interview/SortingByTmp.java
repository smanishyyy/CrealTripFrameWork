package com.java.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class SortingByTmp {
public static void main(String arg[])
{
	int arr[]= {1,2,3,44,66,66,3,48,9};
	List<Integer> in=Arrays.asList(ArrayUtils.toObject(arr));
	TreeSet<Integer>tr=new TreeSet(in);
	System.out.println(tr);
	TreeSet<Integer>tr2=new TreeSet(new MyComparator());
	for(Integer i: tr)
	{
		tr2.add(i);
	}
	System.out.println("tr2 :"+tr2);
	Integer arr3[]=tr2.toArray(new Integer[tr2.size()]);
	int arr4[]=ArrayUtils.toPrimitive(arr3);
	for(int i:arr4)
	{
		System.out.println(i);	
	}
}
}
class MyComparator implements Comparator<Integer>
{

	

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
		{
			return +32;
		}
		else if(o1<o2)
		{
			return -32;	
		}
		else
		{
			return 0;
		}
	}

	
	
}
