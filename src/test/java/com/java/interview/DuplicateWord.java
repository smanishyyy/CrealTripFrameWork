package com.java.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DuplicateWord {
public static void main(String arg[])
{
	String str = "he Apple Special September event has just concluded. As widely speculated, Apple today" + ""
			+ " launched three new iPhones -- iPhone 11, iPhone 11 Pro and iPhone 11 Pro Max-- "
			+ "at an event held in Steve Jobs Theatre, Cupertino. The company also launched th"
			+ "e Apple Watch Series 5 along with a new 10.2";
findItNumOfDupliCharWord(str);
}

private static void findItNumOfDupliCharWord(String str) {

	StringTokenizer st=new StringTokenizer(str," ");
	HashMap<String,Integer> hs=new HashMap<String,Integer>();
	ArrayList<String> al=new ArrayList<String>();
	while(st.hasMoreElements())
	{
		al.add((String) st.nextElement());
	}
for(String s:al)
{
if(hs.containsKey(s))	
{
	hs.put(s, hs.get(s)+1);
}
else
{
	hs.put(s, 1);
}

}
System.out.println(hs.entrySet());
Hashtable<String,Integer> hs2=new Hashtable<String,Integer>(hs);
System.out.println(hs2);
TreeMap<String,Integer> tr=new TreeMap<String,Integer>(hs2);
System.out.println(tr);

}
}
