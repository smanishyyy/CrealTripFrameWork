package practice;

public class classA {
static int temp;
static boolean swap=false;
	public static void main(String arg[]) {
		
		
		int arr[]= {33,55,66,77,3,8,8};
		int[] arr2=bubbleSort(arr);
		
		for(int i:arr2)
		{
			System.out.println(i);
		}
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.println(arr2[i]);	
		}
	}

	private static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
			temp=arr[j]	;
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			swap=true;
				}
			}
			if(swap==false)
			{
				System.out.println("Not swaping");
			break;	
			}
		}
		return arr;
		
	}
	
	
}
