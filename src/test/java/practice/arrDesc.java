package practice;

import java.util.Comparator;

public class arrDesc implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		Integer i1=(Integer)arg0;
		Integer i2=(Integer)arg1;
		if(i1>i2)
		{
			return -32;
		}
		else if(i1<i1)
		{
			return +32;	
		}
		else
		{
			return -0;
		}
	}

}
