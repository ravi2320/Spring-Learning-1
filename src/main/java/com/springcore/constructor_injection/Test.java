package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_injection/ci_config.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		
		Addition add1 = (Addition) context.getBean("add1");
		add1.sum();
		
		Addition add2 = (Addition) context.getBean("add2");
		add2.sum();
	}

}
