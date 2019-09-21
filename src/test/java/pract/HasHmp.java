package pract;

import java.util.HashMap;

public class HasHmp {
	public static void main(String arg[]) {

		HashMap<Integer, Integer> hs = new HashMap<>();
		hs.put(1, 2);
		hs.put(1, 3);
		hs.put(2, null);
		hs.put(null, 9);
		hs.put(null, 7);
		hs.put(3, 5);

		System.out.println(hs.entrySet());
	}
}
