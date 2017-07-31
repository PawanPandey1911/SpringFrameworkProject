package com.learnerslife;

//It will use init-method and do not implements
//InitializingBean interface
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
	//This method is called when init-method="beaninit"
	//is define in <bean >element
	public void beaninit()
	{
		System.out.println("Bean is initialize by <bean> init-method ");
	}

}
