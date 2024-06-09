package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("addr1")
	private Address addr;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address addr) {
		super();
		System.out.println("Inside constructor");
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		System.out.println("Setting values");
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	
}
