package com.santanu.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santanu/spring/springcoreadvanced/standalone/collections/StandaloneCollectionconfig.xml");
		ProductsList productList = (ProductsList) context.getBean("productList");
		System.out.println(productList);

	}

}
