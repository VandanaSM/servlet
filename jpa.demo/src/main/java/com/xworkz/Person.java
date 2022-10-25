package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity   //@Entity is (make dto/pojo class) used for JPA/HIBERNATE Crud operations
@DynamicUpdate
@Table(name="person") //@Table used to define table name and schema name
@Data
@Getter
@Setter
public class Person {

	@Id //Column for primary key of the entity note id should be integer or long type
	private int id;
	private String firstName;
	private String lastName;
	
	
	
}
