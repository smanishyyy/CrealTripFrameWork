package practice;

public class PrimeNum {
public static int count,n=1;
public static boolean flag=true;
	public static void main(String arg[])
	{
	
	while(count!=10)
	{
		flag = true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("No prime number + "+n);
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Prime number + "+n);
			count++;
		}
		n++;
	}
}
}