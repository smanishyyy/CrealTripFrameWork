package pract;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Customer2> {

	@Override
	public int compare(Customer2 o1, Customer2 o2) {
		Integer i1 = o1.rollnum;
		Integer i2 = o2.rollnum;
		if (i1 < i2) {
			return -1;
		}
		if (i1 < i2) {
			return +1;
		} else {
			return 0;
		}
	}

}
