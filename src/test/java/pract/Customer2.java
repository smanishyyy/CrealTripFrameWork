package pract;

public class Customer2 implements Comparable<Customer2> {
	int rollnum;
	String name;
	String city;

	public Customer2(int i, String string, String city) {
		rollnum = i;
		name = string;
		this.city = city;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollnum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer2 other = (Customer2) obj;
		if (rollnum != other.rollnum)
			return false;
		return true;
	}

	@Override
	public int compareTo(Customer2 o) {
		return o.name.compareTo(o.name);
	}
}
