package com.learnerslife;

public class Outer {
	private  String name;
	private Inner inner;
	
	public void setinner(Inner inner)
	{
		this.inner=inner;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public Outer()
	{
		System.out.println("Inside Outer Constructor");
	}
	
	void getname()
	{
		System.out.println("Name:"+name);
		inner.gethouse();
		inner.getlocality();
		inner.getpin();
		inner.getdistrict();
		inner.getstate();
		inner.getcity();
		inner.inner();
	}
	
}
