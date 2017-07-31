package com.learnerslife;

public class Dependency1 {
	int operand1;
	public Dependency1() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of Dependent1");
	}
	public void spellcheck()
	{
		System.out.println("Checking Spelling 1,2,3...");
	}
	public void setoperand1(int operand1)
	{
		System.out.println("Setting value of operand1");
		this.operand1=operand1;
	}

}
