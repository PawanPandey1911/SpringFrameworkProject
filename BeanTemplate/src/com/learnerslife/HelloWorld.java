

package com.learnerslife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
	int a;
	int b;
	public void afterPropertiesSet()
	{
		System.out.println("Parent Bean is intialized:");
	}
	public void destroy()
	{
		System.out.println("Parent Bean is going to be destroy");
	}
	public void geta() {
		System.out.println("Operand 1:" + a);
	}
	public void getb() {
		System.out.println("Operand 2:" + b);
	}

	public void seta(int a) {
		this.a=a;
		
	}
	public void setb(int b) {
		
		this.b=b;
	}
	public void sum()
	{
		System.out.println("Sum is="+(a+b));
	}
	
	 
}

