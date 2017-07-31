package com.learnerslife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;//For proper destroy method
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This code will not work because their no registerShutdownHook()
		 * ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
//		//HelloWorld obj=(HelloWorld)cpn.getBean("hw1");//Bean will automaticall load
		//since lazy-init=false*/
		
		//We will use AbstractApplicationContext interface
		
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		con.registerShutdownHook();//For destroy() or destroy-method in XML to work
		
	}

}
