package com.my.sandbox.designpatterns.program;

import com.my.sandbox.designpatterns.patterns.Singleton;

public class MainProgram {

	public static void main(String[] args) {
		SingletonExample();
	}
	
	public static void SingletonExample() {
		Singleton singleton1 = Singleton.getInstance();
		singleton1.setTestField("Hello World!");
		System.out.println(String.format("Field value in the First Singleton: %s", singleton1.getTestField()));
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(String.format("Field value in the Second Singleton: %s", singleton2.getTestField()));
		
		singleton2.setTestField("The Field was changed from the Second Singleton");
		System.out.println(String.format("Field value in the First Singleton: %s", singleton1.getTestField()));
		System.out.println(String.format("Field value in the Second Singleton: %s", singleton2.getTestField()));
	}
}