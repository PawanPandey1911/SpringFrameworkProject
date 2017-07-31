package com.learnerslife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String args[])
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj1=(HelloWorld)con.getBean("hw1");
		obj1.setmessage("Pawan Pandey");
		obj1.getmessage();
		HelloWorld obj2=(HelloWorld)con.getBean("hw1");
		obj2.getmessage();
		HelloWorld obj3=(HelloWorld)con.getBean("hw2");
		obj3.setmessage("Pawan Pandey");
		obj3.getmessage();
		HelloWorld obj4=(HelloWorld)con.getBean("hw2");
		//obj2.setmessage("Pawan");
		obj4.getmessage();
		
	}
}

