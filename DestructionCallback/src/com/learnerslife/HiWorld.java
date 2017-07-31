package com.learnerslife;

public class HiWorld {

	String message;

	public void setmessage(String message) {
		this.message = message;// value initialized in Beans.xml <property> of
								// <bean> uniquely
		// identified by <bean id="ID"> attribute which lies within <beans>
	}

	public void getmessage() {
		System.out.println("Your Message:" + message);
	}

	// this willwork since destroy-method="beandestroy"
	// 
	public void beandestroy() {
		System.out.println("Bean is destroyed by <bean> destroy-method ");
	}
}
