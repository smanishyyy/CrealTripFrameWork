package pract;

class A {
	A() {
		System.out.println("A cons");
	}

	final void getB() {
		System.out.println("A");
	}
}

class B extends A {

	B() {
		super();
		System.out.println("B cons");

	}

	void getA() {
		System.out.println("B");
		super.getB();

	}
}

class C {
	public static void main(String arg[]) {
		B b = new B();
		b.getA();

	}
}
