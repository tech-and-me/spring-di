package com.emp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value = "e4")
public class Employee implements BeanNameAware , ApplicationContextAware{
	@Value("12")
	private int id;
	@Value("Barry")
	private String fname;
	@Value("Boi")
	private String lname;
	@Autowired
//	@Qualifier(value = "a6")
	private Address addr;
	private ApplicationContext ctx;
	
	public Employee() {
		System.out.println("Inside default constructor of Employee");
	}
	
	public Employee(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		System.out.println("Inside 3 params constructor of Employee");
	}
	
	public Employee(int id, String fname, String lname, Address addr) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.addr = addr;
		System.out.println("Inside 4 params constructor of Employee");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Inside setId of Employee method");
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		System.out.println("Inside setFname of Employee");
		this.fname = fname;
	}
	public String getLname() {
		System.out.println("Inside setLname of Employee");
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	
	public Address getAddr() {
		return addr;
	}

	
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", addr=" + addr + "]";
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("inside beanname aware " + arg0);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Inside ApplicationContext");
		this.ctx = ctx;
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Inside afterPropertySet");
//		this.fname = "Jenny";
//		this.addr = ctx.getBean("a2",Address.class);
//	}
//	
	//This method is the same as AfterPropertiesSet. But propertySet, we don't need to implement Initilize Interface
	// this method is our own customized method and need to also set in beans.xml to invoke it on init. 
	public void doInit() {
		System.out.println("Inside doInit ");
//		this.fname = "Greg";
//		this.addr = ctx.getBean("a2",Address.class);
	}
	
	public void destroy() {
		System.out.println("Inside destroy");
		this.addr = null;
	}


	
}
