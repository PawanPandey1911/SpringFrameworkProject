package com.learnerslife;

public class HelloWorld {
	String message;
	public void setmessage(String message)
	{
		this.message=message;//value initialized in Beans.xml <property> of <bean> uniquely
		//identified by <bean id="ID"> attribute which lies within <beans>
	}
	public void getmessage()
	{
		System.out.println("Your Message:"+message);
	}

}
