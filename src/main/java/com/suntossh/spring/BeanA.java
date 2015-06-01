package com.suntossh.spring;

public class BeanA {
	
	public BeanA(String value) {
		System.out.println("In String Constructor of BeanA");
		System.out.println(value);
	}
	
	
	public BeanA(int value) {
		System.out.println("In Int Constructor of BeanA");
		System.out.println(value);
	}
	
	public BeanA(String value1, String value2) {
		System.out.println("value1 is "+value1);
		System.out.println("value2 is "+value2);
	}
	
	
}
