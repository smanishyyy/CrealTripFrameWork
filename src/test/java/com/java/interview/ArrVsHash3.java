package com.java.interview;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ArrVsHash3 {
	
	public static void main(String arg[])
	
	{
		String str="India";
		char arr[]=str.toCharArray();
		HashMap<Integer,Character> hs=new HashMap<Integer,Character>();
		int i=0;
		for(Character ch:arr)
		{
			hs.put(i, ch);
			i++;
		}
	
		System.out.println(hs);
		Hashtable<Integer,Character> hs2=new Hashtable<Integer,Character>(hs);
		System.out.println(hs2);
		TreeMap<Character,Integer> tr=new TreeMap<Character,Integer>();
		LinkedList<String> ls=new LinkedList<String>();
		for(Entry<Integer, Character> e: hs.entrySet())
		{
			ls.add(e.getValue().toString()+"-"+e.getKey().toString());
		}
		System.out.println(ls);
	}
	

}


