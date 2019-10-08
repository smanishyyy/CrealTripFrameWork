package pract;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashStt {
	public static void main(String arg[]) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(null);
		hs.add(null);
		hs.add(5);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		LinkedList<Integer> ls = new LinkedList<>(hs);
		System.out.println(ls);
	}
}
