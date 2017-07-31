package com.learnerslife;

public class Dependent {

	Dependency1 a;
	Dependency2 b;
	int operand1;
	float operand2;
	
	public Dependent(Dependency1 a,Dependency2 b) {
		//Created for bean object reference
		System.out.println("Inside TEXT EDITOR constructor");
		this.a=a;
		this.b=b;
	}
	
	
	public void texteditor()
	{
		System.out.println("EDITING");
		a.spellcheck();
		b.translator();
	}
	public Dependent(int operand1,float operand2)
	{//created for bean object passing values
		System.out.println("INSIDE CALCULATOR");
		this.operand1=operand1;
		this.operand2=operand2;
	}
	public void sum()
	{
		System.out.println("Sum is="+(operand1+operand2));
	}

}
