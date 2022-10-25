package com.xworkz;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="college")
@PrimaryKeyJoinColumn(name = "studentdata")
@Data
@Getter
@Setter
public class College {

	@Id 
	private int id;
	private String collegeName;
	private String collegeId;
	private String address;
	@OneToMany(mappedBy = "college")
	private List<Student> student; 
	
}
