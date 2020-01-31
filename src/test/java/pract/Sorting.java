package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class Sorting {
	public static LinkedList<Customer2> ls = new LinkedList<>();
	public static int rollnum;
	public static String name;
	public static String city;
	public static int i;
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@SuppressWarnings("unchecked")
	public static void main(String arg[]) throws NumberFormatException, IOException {

		System.out.println("Ensert the student record withr roll numer and  name");

		for (;;) {
			System.out.println("Enter the roll numer");
			rollnum = Integer.parseInt(br.readLine());
			System.out.println("Enter the city");
			city = br.readLine();
			System.out.println("Enter the name");
			name = br.readLine();
			if (name.equals("qq")) {
				break;
			} else {
				ls.add(new Customer2(rollnum, name, city));
			}
		}
		i = 0;
		ls.forEach(arr -> {

			Customer2 cus = arr;
			System.out.println("Customer value at index[" + i + " ]: " + cus.getRollnum() + " : " + cus.getName()
					+ " : " + cus.city);

			i++;
		});

		Collections.sort(ls, new Sortbyroll());
		i = 0;
		ls.forEach(arr -> {

			Customer2 cus = arr;
			System.out.println("Customer value at index[" + i + " ]: " + cus.getRollnum() + " : " + cus.getName()
					+ " : " + cus.city);

			i++;
		});
		Collections.sort(ls, new SortbyName());
		i = 0;
		ls.forEach(arr -> {

			Customer2 cus = arr;
			System.out.println("Customer value at index[" + i + " ]: " + cus.getRollnum() + " : " + cus.getName()
					+ " : " + cus.city);

			i++;
		});
System.out.println("LSSSSS : "+ls);
		Set<Customer2> d = new HashSet<>(ls);
		ls.clear();
		ls.addAll(d);
		Iterator itr = ls.iterator();
		while (itr.hasNext()) {
			Customer2 cs = (Customer2) itr.next();
			System.out.println("Set : " + cs.name + "  :  " + cs.city + " :  " + cs.rollnum);
		}

		HashMap<Object, Object> hs = new HashMap<>();

		for (Customer2 a : ls) {
			hs.put(a.rollnum, a.name + " : " + a.city);
		}
		System.out.println(hs.entrySet());
		Collections.sort(ls);
		for (Customer2 st : ls) {
			System.out.println(st.rollnum + " " + st.name + " " + st.city);
		}
		Customer2[] arrCus = (Customer2[]) ArrayUtils.toPrimitive(ls.toArray(new Customer2[ls.size()]));
		for (Customer2 a : arrCus) {
			System.out.println("ArrayUtils : " + a.rollnum + " " + a.name + " " + a.city);
		}
		List<Customer2> arrCus2 = Arrays.asList(arrCus);
		for (Customer2 a : arrCus) {
			System.out.println("ArrayUtils linked : " + a.rollnum + " " + a.name + " " + a.city);
		}

	}
}
