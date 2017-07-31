package com.learnerslife;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cat = new ClassPathXmlApplicationContext(
				"Beans.xml");
		AbstractXmlApplicationContext con = cat;
		Outer o = (Outer) con.getBean("outer");
		o.getname();
	}

}
