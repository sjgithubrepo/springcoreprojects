package com.santanu.spring.springcoreadvanced.autowireing.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired(required=false)
	@Qualifier("address1")
	private Address address;
	
	
	Employee(Address address){
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
