package com.learnerslife;

public class Dependent {
	private Dependency a;

	public Dependent() {//Constructor
		// TODO Auto-generated constructor stub
		System.out.println("Inside Dependent Constructor");
	}

	// defining setter method of dependency a
	public void seta(Dependency a) {//Setter method for a
		System.out.println("Setting dependency");
		this.a = a;
	}

	public Dependency geta() {//getter method of a
		System.out.println("Returning Dependency object");
		return a;
	}

	public void dependent() {
		System.out.println("Text editing");
		a.dependency();
	}

}
