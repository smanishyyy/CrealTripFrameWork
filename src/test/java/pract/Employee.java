package pract;

public class Employee implements Cloneable {

	@SuppressWarnings("unused")
	private int employeeID;
	@SuppressWarnings("unused")
	private String employeeName;
	@SuppressWarnings("unused")
	private Department departmnet;

	public Employee(int id, String name, Department dept) {
		this.employeeID = id;
		this.employeeName = name;
		this.departmnet = dept;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		Employee cloned = (Employee) super.clone();
		cloned.setDepartment(new Department(getDepartment().getDepartmentId(), getDepartment().getDepartmentName()));
		return cloned;

	}

	public void setemployeeID(int id) {
		this.employeeID = id;
		getDepartment();
	}

	public int getemployeeID() {
		return employeeID;
	}

	public void setemployeeName(String name) {
		this.employeeName = name;
		// this.departmnet.setDepartmentName(name2);
	}

	public String getemployeeName() throws CloneNotSupportedException {
		return employeeName;
	}

	public void setDepartment(Department department) {
		this.departmnet = department;
	}

	public Department getDepartment() {
		return departmnet;
	}

}
