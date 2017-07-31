package com.learnerslife;

public class HelloWorld {
	String message;
	String beanid;

	public void getmessage() {
		System.out.println("My Message:" + message);
	}
	public void setbeanid(String beanid)
	{
		this.beanid=beanid;
	}
	public void getbeanid()
	{
		System.out.println("Bean Created Is:"+beanid);
	}
	public void setmessage(String message) {
		this.message = message;
	}
	public void destroybean()
	{
		System.out.println("Bean Destroyed is:"+beanid);
	}

	

}
