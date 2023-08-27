package com.hrushi.learningspring.examples.a4;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {
	
	//Singleton scope - One Object instance per IoC Container
	//Prototype scope - Possibly many object instances per IoC Container
	
	
	//Scopes Only for web-aware Spring Application Context
	
	//Request - One instance of object per HTTP Request
	//Session - One instance of object per HTTP Session
	//Application - One instance of object per web application runtime
	//Websocket - One instance of object per Websocket instance
	
	
	//Java Singleton(GOF) vs Spring Singleton
	//Spring Singleton - One Object instance per IoC Container
	//Java Singleton - One Object instance per JVM

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(BeanScopeLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			

		}
	}
}