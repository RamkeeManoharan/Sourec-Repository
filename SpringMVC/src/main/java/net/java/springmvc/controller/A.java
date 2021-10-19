package net.java.springmvc.controller;

public interface A {
	
	public void return1();
	
	default void return2() {
		System.out.println("A");
	}

}
