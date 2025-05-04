package com.ibm.Encapsulations;

public class Application {
	
	private int value;
	
	public void setValue(int x) {
		value = x;
	}
	
	public int getValue() {
		return value;
	}
}

class B {
	public static void main(String[] args) {
		Application r = new Application();
		r.setValue(100);
		System.out.println(r.getValue());
	}
}
