package com.learnerslife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TextEditor implements InitializingBean, DisposableBean {
	private SpellChecker a;
	public void afterPropertiesSet() {
		System.out.println("TextEditor Bean is created");
	}

	public void destroy() {
		System.out.println("TextEditor bean is destroyed");
	}
	public TextEditor(SpellChecker a)
	{
		this.a=a;
		System.out.println("Inside texteditor constructor");
	}
	public void textediting()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Working on Text Editor");
			a.spellchecker();
		}
		
	}
	
}
