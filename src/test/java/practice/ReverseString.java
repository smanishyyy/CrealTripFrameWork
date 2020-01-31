package practice;

public class ReverseString {

	
	public static void main(String arg[])
	{
		String str="Manish Chaurasia",rev="";
		
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
	//rev=	rev+str.charAt(;i)	;
			rev=	rev+	arr[i];
		}
		System.out.println(rev);
	}
}
