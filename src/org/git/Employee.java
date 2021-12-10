package org.git;

public class Employee {
	public void add() {
		System.out.println("add");
	}

	private void sub() {
		System.out.println("sub");
	}

	private void divide() {
		System.out.println("divide");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.add();
		e.sub();
		e.divide();
	}
}
