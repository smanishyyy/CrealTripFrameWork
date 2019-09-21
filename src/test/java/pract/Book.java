package pract;

public class Book implements Comparable<Book> {
	int id;
	String name;

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Book o) {

		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}
}