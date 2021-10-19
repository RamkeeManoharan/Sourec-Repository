package net.java.springmvc.controller;

public class C implements B,A{

	@Override
	public void return1() {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}

	@Override
	public void return2() {
		// TODO Auto-generated method stub
		A.super.return2();
		B.super.return2();
	}

}
