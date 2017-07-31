package com.learnerslife;



public class Person {
	private String name;
	
	private Person spouse;

	

	

	public void getname() {
		System.out.println("Your name=" + name);
	}

	public void setname(String name) {
		System.out.println("Setting name="+name);
		this.name = name;
	}

	public void getspouse() {
		System.out.println("Your Spouse=" + spouse.name);
		System.out.println();
	}

	public void setspouse(Person spouse) {
		System.out.println("Setting spouse="+spouse.name);
		this.spouse = spouse;
	}

	
}
