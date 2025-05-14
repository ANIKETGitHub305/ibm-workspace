package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		JavaCollection jc=(JavaCollection)context.getBean("collection");
//		Greeting greeting1 = (Greeting)context.getBean("greeting");
//		System.out.println("Hello "+greeting1.getName());
//		greeting1.setName("TCSer");
//		Greeting greeting2 = (Greeting)context.getBean("greeting");
//		System.out.println("Hello "+greeting1.getName());
//		System.out.println("Hello "+greeting2.getName());
//		context.registerShutdownHook();
//		TextEditor textEditor=(TextEditor)context.getBean("textEditor");
//		textEditor.spellCheck();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TextEditor textEditor = (TextEditor) context.getBean(TextEditor.class);
		textEditor.spellCheck();
		
//		jc.getAddressList();
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();
		System.out.println("End");
	}
}