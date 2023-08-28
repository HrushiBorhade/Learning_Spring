package com.hrushi.learningspring.examples.a7;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")
					) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

		}
	}
}