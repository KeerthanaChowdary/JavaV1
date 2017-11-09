package com.practise.conceptsV1;

public class Singleton {

	//just some random variables

	public String name;
	public int rollNo;
	public boolean admit;

	// private constructor 

	private Singleton() {
		admit = true;
		name = "keerthana";
		rollNo = 1;
	}

	public static void main(String[] args) {
		Singleton justOneObject = new Singleton();
		System.out.println("name: " + justOneObject.name + "\nrollNo: " + justOneObject.rollNo + "\nadmit: " + justOneObject.admit);
	}

}
