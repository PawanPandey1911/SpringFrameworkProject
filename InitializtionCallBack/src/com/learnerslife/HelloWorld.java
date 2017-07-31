package com.learnerslife;
import org.springframework.beans.factory.InitializingBean;
//Implement InitializingBean interface and its method
//void afterPropertiesSet() will invoked automatically as
///bean instance are created
public class HelloWorld implements InitializingBean{

	String message;
	public void afterPropertiesSet()
	{
		//Default method of bean for initializing bean 
		//It is automatically invoked after bean is created
		System.out.println("Bean is intialized using inbuilt method");
		
	}
	public void setmessage(String message) {
		this.message = message;// value initialized in Beans.xml <property> of
								// <bean> uniquely
		// identified by <bean id="ID"> attribute which lies within <beans>
	}

	public void getmessage() {
		System.out.println("Your Message:" + message);
	}
	//this will not work since init-method="beaninit"
	//is override by void afterPropertiesSet
	public void beaninit()
	{
		System.out.println("Bean is initialize by <bean> init-method ");
	}

}
