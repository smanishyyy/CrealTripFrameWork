package pract;

public class Department implements Cloneable {
	public int DepartmentId;
	public String DepartmentName;

	public Department(int id, String name) {
		this.DepartmentId = id;
		this.DepartmentName = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

	public void setDepartmentId(int id) {
		this.DepartmentId = id;

	}

	public int getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentName(String name) {
		this.DepartmentName = name;
		// this.departmnet.setDepartmentName(name2);
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

}
