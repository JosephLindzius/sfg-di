package com.blauwmaan.sfgdo;

import com.blauwmaan.sfgdo.controllers.MyController;
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
	}

}
