package com.learnerslife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cat = new ClassPathXmlApplicationContext(
				"Beans.xml");
		AbstractApplicationContext con = cat;
		Dependent d = (Dependent) con.getBean("dependent");
		d.dependent();
	}

}
