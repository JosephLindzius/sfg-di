package com.blauwmaan.sfgdo;

import com.blauwmaan.sfgdo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDoApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(SfgDoApplication.class, args);
		MyController myController = (MyController) appContext.getBean("myController");

		I18nController i18nController = (I18nController) appContext.getBean("i18nController");
		System.out.println("-------- Using active Profile");
		System.out.println(i18nController.sayHello());
		//qualifier not needed with Primary
		System.out.println("-------- Primary Bean");
		System.out.println(myController.helloWorld());

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
