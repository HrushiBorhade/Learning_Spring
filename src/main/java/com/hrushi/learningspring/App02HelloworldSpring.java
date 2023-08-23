package com.hrushi.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App02HelloworldSpring {
	
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class) ;
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("person4Parameters"));		
		System.out.println(context.getBean("person5Parameters"));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		
		
	}
	

}