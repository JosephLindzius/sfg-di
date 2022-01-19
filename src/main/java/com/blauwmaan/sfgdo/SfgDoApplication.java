package com.blauwmaan.sfgdo;

import com.blauwmaan.sfgdo.controllers.ConstructorInjectedController;
import com.blauwmaan.sfgdo.controllers.MyController;
import com.blauwmaan.sfgdo.controllers.PropertyInjectedController;
import com.blauwmaan.sfgdo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDoApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(SfgDoApplication.class, args);
		MyController myController = (MyController) appContext.getBean("myController");
		String greeting = myController.helloWorld();
		System.out.println(greeting);
		//not recommended
		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appContext.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) appContext.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());
		//best choice - no autowired needed
		System.out.println("-------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
