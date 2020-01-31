package com.java.interview;

public class Sorting {
public static boolean swap=false;
public static int temp;
	public static void main(String arg[])
	{
		int arr[]= {11,2,12,3,55,6,45};
		int arr2[]=sorting(arr);
		//int temp;
		for(int i:arr2)
		{
			System.out.println(i);
		}
		
	}

	private static int [] sorting(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
					
				}
			}
			if(swap==false)
			{
				break;
			}
		}
		return arr;
	}
}
