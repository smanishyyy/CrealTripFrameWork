package com.java.interview;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DuplicateCharacter {

	
	public static void main(String arg[])
	{
		String str="kczxcz cvkxabcdabngfhqafnnnbascsilvsvjvjk";
		findDuplicateChar(str);
	}

	private static void findDuplicateChar(String str) {
		System.out.println(str);
	char arr[]=str.toCharArray();
	
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	for(int i=0;i<arr.length;i++)
	{
	if(hs.containsKey(Character.valueOf(arr[i])))
	{
		hs.put(Character.valueOf(arr[i]), hs.get(Character.valueOf(arr[i]))+1);
	}
	else
	{
		hs.put(Character.valueOf(arr[i]), 1);
	}
	
		
	}
	System.out.println(hs.entrySet());
	
	
	for(Entry<Character, Integer> e:hs.entrySet())
	{
		System.out.println(e.getKey()+"-"+e.getValue());
	}
	Hashtable<Character,Integer> hs2=new Hashtable<Character,Integer>(hs);
	System.out.println(hs2);
	TreeMap<Character,Integer> tr=new TreeMap<Character,Integer>(hs2);
	System.out.println(tr);
}
}
