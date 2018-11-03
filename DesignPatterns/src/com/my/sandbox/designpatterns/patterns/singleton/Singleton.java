package com.my.sandbox.designpatterns.patterns.singleton;

public class Singleton {
	
	private static volatile Singleton instance;
	private volatile String testField;
	
	private Singleton() {
	}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public synchronized String getTestField() {
		return testField;
	}
	
	public synchronized void setTestField(String testField) {
		this.testField = testField;
	}	
}