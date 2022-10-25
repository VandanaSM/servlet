package com.xworkz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class EmployeeDTO {

	@Id
	@GeneratedValue   //will generate auto id for primary key
	@Column(name="EMP_ID")
	private int id;
	@Column(name="EMP_NAME")
	private String name;
	@Column(name="EMP_ADDRESS")
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
}
