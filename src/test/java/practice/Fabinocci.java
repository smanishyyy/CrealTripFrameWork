package practice;

public class Fabinocci {
public static int nextTerm,a=0,b=1;
	
	public static void main(String arg[])
	{
		int num=10;
		
		for(int i=0;i<num;i++)
		{
			System.out.print(a+" ");
			nextTerm=a+b;
			a=b;
			b=nextTerm;
			
		}
	}
}
