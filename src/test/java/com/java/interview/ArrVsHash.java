package com.java.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class ArrVsHash {

	
	public static void main(String arg[])
	{
	
		int arr1[]= {1,22,3,44,55,66,77};
		int arr2[]={11,2,33,4,5,6,7};
		List<Integer>ls=Arrays.asList(ArrayUtils.toObject(arr1));
		LinkedList<Integer> ls2=new LinkedList<Integer>(ls);
		List<Integer>ll=Arrays.asList(ArrayUtils.toObject(arr2));
		LinkedList<Integer> ll2=new LinkedList<Integer>(ll);
		LinkedList<String> ll3=new LinkedList<String>();
		
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer> ();
		for(int i=0;i<ls.size();i++)
		{
			hs.put(ls.get(i), ll.get(i));
		}
		System.out.println(hs.get(22));
		Hashtable<Integer,Integer>hs3=new Hashtable<Integer,Integer>(hs);
		System.out.println(hs3);
		System.out.println(hs);
		//System.out.print("[");
		Set st=hs.entrySet();
		System.out.println("Set : "+st);
		for(Entry<Integer, Integer> en :hs.entrySet())
		{
		
			//System.out.print(en.getKey()+"-"+en.getValue()+" ,");
			ll3.add(en.getKey().toString()+"-"+en.getValue().toString());
			
		
		}
		
		//System.out.print("]");
		System.out.println(ll3);
		
		
				}

}
