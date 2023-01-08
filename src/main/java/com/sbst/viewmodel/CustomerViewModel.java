package com.sbst.viewmodel;

import com.sbst.entity.Customer;

public class CustomerViewModel {

	private String name;

	private int age;

	private String sex;

	private String address;

	public CustomerViewModel(Customer customer) {
		this.name = customer.getName();
		this.age = customer.getAge();
		this.sex = customer.getSex();
		this.address = customer.getAddress();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
