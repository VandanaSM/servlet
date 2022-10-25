package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
//@Table : it will table anme in database
@Table(name="student_table")
@Data
public class Student {

	@Id
	
	private int id;
	private String name;
	private String address;
	private int marks;
	
	
	
}
