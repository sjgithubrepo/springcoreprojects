package com.santanu.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santanu/spring/springcore/propertyplaceholder/propertyplaceholderconfig.xml");
		MyDAO mydao = (MyDAO) context.getBean("myDAO");
		System.out.println(mydao);
	}
}
