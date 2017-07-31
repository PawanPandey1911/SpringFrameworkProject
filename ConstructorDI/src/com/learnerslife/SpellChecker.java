package com.learnerslife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpellChecker implements DisposableBean,InitializingBean{
	

	public void afterPropertiesSet() {
		System.out.println("Spellchecker bean is created");
	}

	public void destroy() {
		System.out.println("Spellchecker bean is destroyed");
	}
	public SpellChecker()
	{
		System.out.println("Inside spellchecker constructor");
	}
	public void spellchecker()
	{
		System.out.println("Doing spelling checking");
	}
}
