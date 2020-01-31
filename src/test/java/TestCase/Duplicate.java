package TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Duplicate {

	public static void main(String rgs[]) {
		String str = "manish.chaurasia@cts.com";
		StringTokenizer token = new StringTokenizer(str, " @ .");
		ArrayList<String> al = new ArrayList<String>();
		while (token.hasMoreElements()) {
			al.add(token.nextToken());
		}

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		duplicateFinder(str);
	}

	private static void duplicateFinder(String str) {
		char[] str2 = str.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (char c : str2) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			} else

			{
				hs.put(c, 1);
			}
		}
		System.out.println("HashMap: " + hs.entrySet());

	}

}
