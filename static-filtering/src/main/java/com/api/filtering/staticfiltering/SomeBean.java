package com.api.filtering.staticfiltering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"name", "phone"})  
/*@JsonIgnoreProperties is a class-level annotation.It ignores the logical properties in JSON serialization and deserialization.*/
public class SomeBean {
	private  String name;  
	private  String phone;  
	//JsonIgnore indicates that the annotated method or field is to be ignored  
	@JsonIgnore  
	private  String salary;  
	  
	public SomeBean(String name, String phone, String salary)   
	{  
	super();  
	this.name = name;  
	this.phone = phone;  
	this.salary = salary;  
	}  
	public String getName()   
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	public String getPhone()   
	{  
	return phone;  
	}  
	public void setPhone(String phone)   
	{  
	this.phone = phone;  
	}  
	public String getSalary()   
	{  
	return salary;  
	}  
	public void setSalary(String salary)   
	{  
	this.salary = salary;  
	}  
}
