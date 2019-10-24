package pract;

public class Test1 {
	//

	//

	public static void main(String[] args) {
		System.out.println("inside main method of Test 1");
		int a = TestLab.method("Line 26", 66);
	}

	Test1() {
		System.out.println("Default Constructor of Test1");
	}

	{
		System.out.println("In instance block of Test1");
	}

	static {
		System.out.println("In Static Block of Test1");
	}

	static int methodOfTest1() {
		System.out.println("inside static method:mehtodOfTest1()");
		return 3;
	}

	static int e = methodOfTest1();
	static int d = TestLab.method("Line 37", 3);
	static Test1 ref = new Test1();

}