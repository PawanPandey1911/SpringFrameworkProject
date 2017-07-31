

package com.learnerslife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
	String message1;
	String message2;
	public void afterPropertiesSet()
	{
		System.out.println("Parent Bean is intialized:");
	}
	public void destroy()
	{
		System.out.println("Parent Bean is going to be destroy");
	}
	public void getmessage() {
		System.out.println("Your Message1:" + message1+":Your Messaage2:"+message2);
	}

	public void setmessage1(String message) {
		this.message1=message;
		
	}
	public void setmessage2(String message) {
		
		this.message2=message;
	}
	 
}

