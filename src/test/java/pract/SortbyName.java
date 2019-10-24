package pract;

import java.text.Collator;
import java.util.Comparator;

public class SortbyName implements Comparator<Customer2> {
	Collator collator = Collator.getInstance();

	@Override
	public int compare(Customer2 o1, Customer2 o2) {
		return o1.name.compareTo(o2.name);
		// return collator.compare(o1.name, o2.name);
	}

}
