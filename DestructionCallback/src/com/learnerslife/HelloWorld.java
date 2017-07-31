package com.learnerslife;
import org.springframework.beans.factory.DisposableBean;

public class HelloWorld implements DisposableBean {
	String message;

	public void destroy()
	{
		System.out.println("Bean is destroyed using inbuilt method");
	}

	public void setmessage(String message) {
		this.message = message;// value initialized in Beans.xml <property> of
								// <bean> uniquely
		// identified by <bean id="ID"> attribute which lies within <beans>
	}

	public void getmessage() {
		System.out.println("Your Message:" + message);
	}

	// this will not work since destroy-method="beandestroy"
	// is override by void afterPropertiesSet
	public void beandestroy() {
		System.out.println("Bean is destroyed by <bean> destroy-method ");
	}
}
