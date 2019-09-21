package pract;

import java.util.concurrent.ConcurrentHashMap;

public class FailSafeItr {
	public static void main(String[] args) {

		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put(null, 7);
		map.put(null, 7);
		System.out.println(" : " + map.get(0));
		// map.put("ONE", 1);
		// map.put("TWO", 2);
		// map.put("THREE", 3);
		// map.put("FOUR", 4);
		//
		// // Getting an Iterator from map
		// Iterator it = map.keySet().iterator();
		//
		// while (it.hasNext()) {
		// String key = (String) it.next();
		// System.out.println(key + " : " + map.get(key));
		//
		// // This will reflect in iterator.
		// // Hence, it has not created separate copy
		// map.put("SEVEN", 7);
		// map.put("jjj", 7);
		// map.put("jjjhhh", 7);

		// }
	}
}