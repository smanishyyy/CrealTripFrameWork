package com.java.interview;

public class BubbleSorting {
public static int temp;
public static Boolean b;
	public static void main(String arg[])
	{
		int arr2[]= {11,2,12,3,55,6,45};
		int arr3[]=sorting(arr2);
		for(int i:arr3)
		{
			System.out.print(i+",");
		}
		
	}

	private static int [] sorting(int[] arr2) {
		
		for(int i=0;i<arr2.length-1;i++)
		{
			for(int j=0;j<arr2.length-i-1;j++)
			{
				if(arr2[j]>arr2[j+1])
				{
				temp=arr2[j];
				arr2[j]=arr2[j+1];
				arr2[j+1]=temp;
			b=true;
				
				}	
			}
			if(b=false)
			{
			break;	
			}
		}
		return arr2;
	
		
	}
	
}
