package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="studentData")  //class tag looks for entity and table if table named so is not there creates a table with column having fields as belows
@Data
@Getter
@Setter
@PrimaryKeyJoinColumn(name="college")

public class Student {

	@Id
	private int id;
	private String name;
	private String rollNo;
	private int age;
	private int marks;
	@OneToOne
	private College college;
	
	
}
