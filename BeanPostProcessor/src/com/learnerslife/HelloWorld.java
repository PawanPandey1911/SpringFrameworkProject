package com.learnerslife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean,DisposableBean {
	String message;
	public void afterPropertiesSet()
	{
		System.out.println("Bean is intialized:");
	}
	public void destroy()
	{
		System.out.println("Bean is going to be destroy");
	}
	public void getmessage() {
		System.out.println("Your Message:" + message);
	}

	public void setmessage(String message) {
		this.message=message;
	}
	 
}
