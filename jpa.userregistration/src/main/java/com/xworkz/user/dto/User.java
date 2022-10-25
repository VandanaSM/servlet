package com.xworkz.user.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="userUnit")
@Data
@Getter
@Setter
@NamedQuery(name="findbyEmail", query = "select u from User u where u.email=:email")
//@NamedQueries(value= {@NamedQuery})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="EMAIL",unique = true,nullable = false,length = 100)
	private String email;
	@Column(name="NAME")
	private String name;
	@Column(name="AGE")
	private int age;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="DOB")
	private Date dateOfBirth;
	
}
