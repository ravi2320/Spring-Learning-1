package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		
		System.out.println("_________________________________________________");
		System.out.println(student.getState());
		System.out.println(student.getState().getClass().getName());
	}

}
