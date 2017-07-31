package com.learnerslife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		con.registerShutdownHook();
	}

}
