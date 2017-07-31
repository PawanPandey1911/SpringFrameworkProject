package com.learnerslife;

public class Dependency2 {
	float operand2;
	public Dependency2() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of Dependency2");
	}
	public void translator()
	{
		System.out.println("Translating...");
	}
	public void setoperand2(float operand2)
	{
		System.out.println("Setting value of operand2");
		this.operand2=operand2;
	}

}
