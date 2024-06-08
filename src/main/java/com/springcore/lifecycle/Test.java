package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Vadapav v1 = (Vadapav) context.getBean("v1");
		System.out.println(v1);
		context.registerShutdownHook();

		System.out.println("==================================================");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		System.out.println("===================================================");
		Example e1 = (Example) context.getBean("example");
		System.out.println(e1);
	}

}
