package net.java.springmvc.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileOutputStream data1=new FileOutputStream("abc1.txt");
			System.out.println("hello");
			
		}
		catch (FileNotFoundException e) {
			System.out.println("ArithmeticException");
			// TODO: handle exception
		}
		
		finally {
			System.out.println("hello");
		}
	}

}
