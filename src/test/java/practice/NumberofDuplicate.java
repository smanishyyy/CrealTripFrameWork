package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class NumberofDuplicate {
public static void main(String arg[])
{
	String str="My name is manish chaurasia";
	char arr[]=str.toCharArray();
	HashMap<Character,Integer> hs=new HashMap<>();
	for(char arr2: arr)
		
	{
	if(hs.containsKey(arr2))	
	{
		hs.put(arr2, hs.get(arr2)+1);
	}
	else
	{
		hs.put(arr2, 1);
	}
	}
	System.out.println(hs.entrySet());
	
	for(Entry<Character,Integer> en:hs.entrySet())
	{
		System.out.println(en.getKey()+" "+en.getValue());
	}
	StringTokenizer sk=new StringTokenizer(str," ");
	ArrayList<String> al=new ArrayList<String>();
	HashMap<String,Integer> hs2=new HashMap<>();
	while(sk.hasMoreTokens())
	{
		
		al.add(sk.nextToken());
	}
	for(String d:al)
	{
		if(hs2.containsKey(d))
		{
			
			hs2.put(d, hs2.get(d)+1);
		}
		else
		{
			hs2.put(d, 1);
		}
	}
	System.out.println(hs2);

	int i=0;
	String rev="";
	for(String str2:al)
	{
		rev=rev+al.get(i);
		i++;
	}
	System.out.println(rev);
	
}
}
