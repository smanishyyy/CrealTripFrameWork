package pract;

class A {
	
	public static int a=10;
	public int b=20;
	A() {
		System.out.println("A cons");
	}

	public  void getB() {
		System.out.println("A");
	}
	public static  void getC() {
		System.out.println("A extends A");
	}
}

class B extends A {
	public static  void getC() {
		System.out.println("B extends A");
	}
	B() {
		super();
		System.out.println("B cons");

	}
	public final void getB() {
		System.out.println("AAA");
	}

	void getA() {
		System.out.println("B");
		getB();
		System.out.println(a);
		System.out.println(b);

	}
}

class C {
	public static void main(String arg[]) {
		A b = new B();
		b.getC();
		b.getB();

	}
}
