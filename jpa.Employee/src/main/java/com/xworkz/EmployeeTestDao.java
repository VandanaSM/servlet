package com.xworkz;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeTestDao {

	public static void main(String[] args) {
		
		EmployeeDTO employee = new EmployeeDTO();
		//employee.setId(1);
		employee.setName("Kumar");
		employee.setAddress("Amritsar");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();  //start persistence area
		//saving the data
		EmployeeDTO emp2=entityManager.find(EmployeeDTO.class,1);
		entityManager.persist(employee);
		employee.setName("Sneha sharma");
		//get the data 
		//EmployeeDTO employee2=entityManager.find(EmployeeDTO.class, 2); //if id is not present find method throws nullPointerException
		//find method will get record from db where id is equal to 2
		//update a existing record
		//employee2.setAddress("Jammu");
		//deleting record using remove method id=4 --first use find method by passing primary key id
		//EmployeeDTO removeEmp=entityManager.find(EmployeeDTO.class, 4);
		//entityManager.remove(removeEmp);
		employee.setName("Sneha");
		entityTransaction.commit();  //end persistence area
		employee.setName("Sneha rao");
		entityManager.close();
	    entityManagerFactory.close();
	  // System.out.println("----------------Employee info----------------" +employee2.toString());
		
	   EmployeeTestDao.getAllEmployees();
	   EmployeeTestDao.getEmployeeName();
	}
	
	public static void getAllEmployees() {  //to fetch all records
		//EntityManagerFactory below will read all db and hibernates properties in entityManager object
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
	   // transaction.begin();
	    //Query (its interface javax.persistence)
	    //Query object holds the information which was returned by jpa query
	    //Query object is like ResultSet in jdbc
	    //Query will return class object which was passed in query
	    Query query=manager.createQuery("from EmployeeDTO");
	    query.getResultList().forEach(e->{
	    	System.out.println("emp:"+e.toString());
	    });
	   // transaction.commit();
	    manager.close();
	    factory.close();
	}
	
	public static void getEmployeeName() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager manager=factory.createEntityManager();
	    Query query=manager.createQuery("select a.name from EmployeeDTO a");
	    query.getResultList().forEach(e->{  //lambda expression used ,we cannot use List 
	    	System.out.println("emp name:"+e.toString());
	    });
	    List<String> list=query.getResultList();
	    	
	    
	    manager.close();
	    factory.close();
	}
}
