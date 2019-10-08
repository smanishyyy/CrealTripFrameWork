package pract;

public class TestClone {

	public static void main(String arg[]) throws CloneNotSupportedException {
		Department d = new Department(1, "Human resource");
		Employee original = new Employee(1, "Admin", d);
		Employee cloned = (Employee) original.clone();
		System.out.println("cloned id : " + cloned.getemployeeID());

		boolean bool = (original != cloned);
		System.out.println("Check object reference :  " + bool);
		System.out.println(original.getClass() == cloned.getClass());
		System.out.println(original.equals(cloned));
		System.out.println("original name: " + original.getemployeeName());
		cloned.setemployeeName("HHHH");
		System.out.println("Cloned name: " + cloned.getemployeeName());
		System.out.println("original name: " + original.getemployeeName());
		cloned.setemployeeName("32fsdfsdf");
		System.out.println("Cloned name: " + cloned.getemployeeName());
		System.out.println("Cloned name: " + cloned.getDepartment().getDepartmentName());

		cloned.getDepartment().setDepartmentName("Change");
		System.out.println("Cloned name: " + cloned.getDepartment().getDepartmentName());
		System.out.println("Cloned name: " + d.getDepartmentName());
		cloned.getDepartment().setDepartmentName("Horlics");
		System.out.println("Cloned name: " + cloned.getDepartment().getDepartmentName());
		System.out.println("Cloned name: " + d.getDepartmentName());
	}
}
