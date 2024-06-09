package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
	@Value("Ravindra Kadam")
	private String name;
	
	@Value("Pune")
	private String city;
	
	@Value("#{state}")
	private List<String> state;
	
	public String getName() {
		return name;
	}
	
	public List<String> getState() {
		return state;
	}

	public void setState(List<String> state) {
		this.state = state;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
}
