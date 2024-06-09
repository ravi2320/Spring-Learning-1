package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student student = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		
		/*
		 * System.out.println(student);
		 * 
		 * System.out.println("_________________________________________________");
		 * System.out.println(student.getState());
		 * System.out.println(student.getState().getClass().getName());
		 */
		System.out.println("Prototype scope using annotation");
		System.out.println("Hashcode of student object : " + student.hashCode());
		System.out.println("Hashcode of student2 object : " + student2.hashCode());
		System.out.println("__________________________________________________________");

		System.out.println("Prototype scope using xml");
		Teacher t1 = context.getBean("t1", Teacher.class);
		Teacher t2 = context.getBean("t1", Teacher.class);
		System.out.println("Hashcode of t1 object : " + t1.hashCode());
		System.out.println("Hashcode of t2 object : " + t2.hashCode());
		
		
	}

}
