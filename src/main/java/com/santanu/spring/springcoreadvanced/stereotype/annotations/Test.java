package com.santanu.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santanu/spring/springcoreadvanced/stereotype/annotations/Annotationconfig.xml");
		Instructor instructor1 = (Instructor) context.getBean("inst");
		System.out.println(instructor1);

		Instructor instructor2 = (Instructor) context.getBean("inst");
		System.out.println(instructor2);
	}

}
