package com.java.interview;

public class SwaptwoArray {
	public static int temp;
	public static void main(String arr[])
	{
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {5,3,4,5,7,8},j=0;
		for(int i:arr1)
		{
		temp=arr2[j];
		arr2[j]=arr1[j];
		arr1[j]=temp;
		j++;
		}
		System.out.print("arr1 : ");
		for(int j2:arr1)
		{
			System.out.print(j2);
		}
		System.out.println();
		System.out.print("arr : ");
		for(int j2:arr2)
		{
			System.out.print(j2);
		}
		
		}

}
