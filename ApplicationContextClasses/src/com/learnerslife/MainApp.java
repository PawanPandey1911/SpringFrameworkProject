package com.learnerslife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		//method 1 class implement ApplicationContext
		HelloWorld obg=(HelloWorld)con.getBean("hw1");
		obg.getmessage();
		con=new FileSystemXmlApplicationContext("C:\\Eclipse Workspace\\ApplicationContextClasses\\src\\Beans.xml");
		//method 2 class implement ApplicationContext
		obg=(HelloWorld)con.getBean("hw2");
		obg.getmessage();
		//Web based later
		
	}

}
