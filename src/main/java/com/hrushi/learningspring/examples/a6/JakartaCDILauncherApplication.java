package com.hrushi.learningspring.examples.a6;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService{
	private DataService dataService;
	
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
		System.out.println("Setter Injection");
	}
	public DataService getDataService() {
		return dataService;
	}

	
}
@Component
class DataService{
	
}
@Configuration
@ComponentScan
public class JakartaCDILauncherApplication {
	
	// CDI specification introduced in Java EE 6
	// Now called Jakarta Contexts and Dependency Injection
	
	// CDI is an Specification(Interface)
		//Spring implements CDI
	
	//Important Inject API Annotations
	
		//Inject ~ Autowired in spring
		//Named  ~ Component in spring
		//Qualifier
		//Scope
		//Singleton
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(JakartaCDILauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).getDataService());

		}
	}
}