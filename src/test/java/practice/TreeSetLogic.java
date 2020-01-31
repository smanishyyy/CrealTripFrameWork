package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TreeSetLogic {

	public static int in;
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		TreeSet<Integer> tr=new TreeSet<>();
		
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter number :");
		in=Integer.parseInt(br.readLine());
		tr.add(in);
	}
	System.out.println(tr);
	
	TreeSet<Integer> tr2=new TreeSet(new arrDesc());
	for(Integer l:tr)
	{
		tr2.add(l);
	}
	System.out.println(tr2);
	
	
	
	}
}
