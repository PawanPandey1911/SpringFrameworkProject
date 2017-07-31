package com.learnerslife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cat=new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext con=cat;
		Dependent t=(Dependent)con.getBean("textedit1");
		t.texteditor();
		t=(Dependent)con.getBean("textedit2");
		t.texteditor();
		t=(Dependent)con.getBean("textedit3");
		t.sum();
		t=(Dependent)con.getBean("textedit4");
		t.sum();
		t=(Dependent)con.getBean("textedit5");
		t.sum();
		//t=(Dependent)con.getBean("textedit6");
		//t.sum();
		con.registerShutdownHook();
		cat.close();
	}

}
