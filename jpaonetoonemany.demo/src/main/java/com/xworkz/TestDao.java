package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDao {

	public static void main(String[] args) {
		
		//STEP 1: create entity object and set the values using setter
		Person person=new Person();
		person.setId(2);
		person.setFirstName("Adam");
		person.setLastName("Hussain");
		
		//STEP 2: its used to create entityManager by reading persistence.xml file and it will load and DB and hibernate properties to
		          //entityManager object
		        //entityManager is an Interface--for each database one entityManagerFactory
		EntityManagerFactory factoryManager= Persistence.createEntityManagerFactory("student_xworkz");
		
		//STEP 3:entityManager(Interface) used to perform CRUD operations
		EntityManager entityManager=factoryManager.createEntityManager();
		
		//STEP 4:EntityTransaction is used to perform transaction management to save or update
		   //EntityTransaction is used only when we are saving or updating objects
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		//STEP 5:persist method will insert record into table
		entityManager.persist(person);
		//commit method will flush out all the data into the database
		transaction.commit();
		
		entityManager.close();
		factoryManager.close();
		
		
		
	}
}
