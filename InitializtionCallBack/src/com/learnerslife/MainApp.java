package com.learnerslife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		
		@SuppressWarnings("unused")
		HelloWorld obj=(HelloWorld)con.getBean("hw1");
		obj=(HelloWorld)con.getBean("hw2");

	}

}
