package com.hrushi.learningspring.examples.a3;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}

@Component
@Lazy
//Indicates whether a bean is to be lazily initialized.
//May be used on any class directly or indirectly annotated 
//with @Component or on methods annotated with @Bean.
class ClassB{
	ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization Logic");
		
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncherApplication.class)) {
			
			System.out.println("Something before Spring Bean Initilization");
			context.getBean(ClassB.class).doSomething();
		}
	}
}