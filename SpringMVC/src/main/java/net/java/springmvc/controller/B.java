package net.java.springmvc.controller;

public interface B {
	
public void return1();
	
	default void return2() {
		System.out.println("B");
	}

}
