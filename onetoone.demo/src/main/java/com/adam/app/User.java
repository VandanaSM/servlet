package com.adam.app;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	@Id
	@GeneratedValue
	@Column(name="USER_ID")// to give user defined column name
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	@OneToOne (cascade=CascadeType.ALL)			//to map one to one relation in the table
	private Address address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
