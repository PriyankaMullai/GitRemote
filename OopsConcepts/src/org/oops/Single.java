package org.oops;

public class Single extends Inheritance {

	public void sing() {
		System.out.println("sing");
	}

	public void singInh() {
		System.out.println("Method1");
	}

	public void singlein() {
		System.out.println("Methiod2");
	}

	public static void main(String[] args) {
		Single s = new Single();
		s.sing();
		s.singInh();
		s.singlein();
		s.single();
		s.single2();
		s.single3();

	}

}
