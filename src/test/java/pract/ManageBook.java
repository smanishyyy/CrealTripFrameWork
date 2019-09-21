package pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class ManageBook {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static TreeSet<Book> tr = new TreeSet<>();
	public static int i, id;
	public static String name;
	public static Book b;

	public static void main(String arg[]) throws NumberFormatException, IOException {
		System.out.println("Enter the book details");
		i = 0;
		for (;;) {
			System.out.println("Enter id for book at [" + i + "]");
			id = Integer.parseInt(br.readLine());
			System.out.println("Enter name for book at [" + i + "]");
			name = br.readLine();
			if (name.equals("qq")) {
				break;
			} else {
				tr.add(new Book(id, name));
			}

			i++;
		}
		Iterator itr = tr.iterator();
		while (itr.hasNext())

		{
			b = (Book) itr.next();
			System.out.println(b.id + "  :  " + b.name);
		}
		Book n = tr.ceiling(b);

	}
}
