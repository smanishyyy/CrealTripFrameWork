package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.util.SystemOutLogger;

public class palindrome {

	public static int rem,sum=0,temp;
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i=	Integer.parseInt(br.readLine());
	temp=i;
	while(i>0)
		
	{
	rem=i%10;
	sum=sum*10+rem;
	
	i=i/10;
	}
	
System.out.println(sum);
if(temp==sum)
	{
	System.out.println("Pallindrome");
}
else
{
	System.out.println("Not Pallindrome");	
}
	}
}
