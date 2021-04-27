package com.santanu.spring.springcoreadvanced.autowireing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santanu/spring/springcoreadvanced/autowireing/autowireingconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
