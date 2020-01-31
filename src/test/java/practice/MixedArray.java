package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class MixedArray {

	
	public static void main(String arg[])
	{
		int arr[]= {1,22,33,44};
		
		List<Integer>ls=Arrays.asList(ArrayUtils.toObject(arr));
		System.out.println(ls);
		LinkedList<Integer> ls2=new LinkedList<Integer>(ls);
		System.out.println(ls2);
		Integer in[]=ls2.toArray(new Integer[ls2.size()]);
		int arr4[]= ArrayUtils.toPrimitive(in);
		for(int i:arr4)
		{
			System.out.print(i);
		}
	}
}
