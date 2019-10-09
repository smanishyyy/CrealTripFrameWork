package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

public class HashMapListWork {
	public static String str;
	public static int i, j, counter;
	static HashMapListWork hs;
	HashMap<String, ArrayList<Integer>> map = new HashMap<>();

	static List<ArrayList<Integer>> ls;
	static List<String> ls2;

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Lets start mapping of number with fruits");
		// str = br.readLine();
		i = 0;
		counter = 0;
		hs = new HashMapListWork();
		for (;; i++) {
			System.out.println("Insert fruit at indes [" + i + "]");
			str = br.readLine();
			System.out.println("Number of element that you wantto insert");
			j = Integer.parseInt(br.readLine());
			counter++;
			if (j == 00) {
				break;
			} else {
				hs.inputdata(str, j, counter++);

			}
		}
		hs.displayDat();
		System.out.println("list :" + ls);
	}

	private void displayDat() {
		for (Entry<String, ArrayList<Integer>> mp : map.entrySet()) {
			System.out.print(mp.getKey() + "|");
			for (int frNo : mp.getValue()) {
				System.out.print(frNo + " ");
			}
			System.out.println();

		}
		System.out.println("MAp: " + map);
		ls = Collections.list(Collections.enumeration(map.values()));
		Iterator itr = ls.iterator();

		for (ArrayList<Integer> mp2 : ls) {
			System.out.println("MP2 : " + mp2);
		}
		ls2 = Collections.list(Collections.enumeration(map.keySet()));
		for (String mp2 : ls2) {
			System.out.println("Key : " + mp2);
		}
	}

	private void inputdata(String str2, int j2, int counter2) {
		Random rn = new Random();
		ArrayList<Integer> fruit = new ArrayList<>();
		for (int i = 0; j2 > i; i++) {
			fruit.add(rn.nextInt(10));
		}
		map.put(str2, fruit);
		System.out.println("Map :" + map);

	}

}
