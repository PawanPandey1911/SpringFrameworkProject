/**
 * 
 */
package com.learnerslife;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Pawan Pandey
 *
 */
public class MainApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld)con.getBean("hw1");//hw1 is bean id in beans.xml
		obj.getmessage();
		obj=(HelloWorld)con.getBean("hw2");
		obj.getmessage();
		obj=null;
	}
}
