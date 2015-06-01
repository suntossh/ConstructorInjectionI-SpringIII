package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BeanA bean1 = context.getBean("bean1",BeanA.class);
		BeanA bean2 = context.getBean("bean2",BeanA.class);
		BeanA bean3 = context.getBean("bean3",BeanA.class);
		BeanA bean2_5 = context.getBean("bean2.5",BeanA.class);
	}
	
	

}
