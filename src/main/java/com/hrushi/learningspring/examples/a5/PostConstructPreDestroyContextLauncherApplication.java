package com.hrushi.learningspring.examples.a5;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	private SomeDependency someDependency;
	SomeClass(SomeDependency someDependency){
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are Initialized");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean-up");
	}
	
}

@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Getting Ready after everything is initialized");
		
	}
	
}
@Configuration
@ComponentScan
public class PostConstructPreDestroyContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(PostConstructPreDestroyContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

		}
	}
}