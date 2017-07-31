package com.learnerslife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Subclass implements InitializingBean, DisposableBean {

	String message1;//inherit
	String message2;//override
	String message3;//new
	public void afterPropertiesSet()
	{
		System.out.println("Child Bean is intialized:");
	}
	public void destroy()
	{
		System.out.println("Child Bean is going to be destroy");
	}
	public void getmessage() {
		System.out.println("Your Message1:" + message1+":Your Messaage2:"+message2+":Your Message3:"+message3);
	}
	
	public void setmessage1(String message) {
		this.message1=message;
	
	}
	public void setmessage2(String message) {
	
		this.message2=message;

	}
	public void setmessage3(String message) {
		
		this.message3=message;
	}
}
