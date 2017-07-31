package com.learnerslife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HiWorld implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanname)
			throws BeansException {
		System.out.println("Bean Before Initialization:"+beanname);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanname)
			throws BeansException {
		System.out.println("Bean After Initialization:"+beanname);
		return bean;
	}

}
