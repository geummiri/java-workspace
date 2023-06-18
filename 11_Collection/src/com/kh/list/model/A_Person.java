package com.kh.list.model;

public class A_Person implements Comparable<A_Person>{
	
	private String name;
	private String addr;
	private int age;
	
	public A_Person() {}
	
	public A_Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "A_Person [name= "
				+ name +", addr = " + addr +
				" age = " + age + "]";
	}
	
	@Override
	public int compareTo(A_Person o) {
		return this.name.compareTo(name);
	}
	}
