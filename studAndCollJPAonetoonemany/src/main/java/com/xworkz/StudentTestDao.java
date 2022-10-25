package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTestDao {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(2);
		student.setName("Jay");
		student.setRollNo("AMC0012015084");
		student.setAge(20);
		student.setMarks(585);
		
		
		EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("studentData_xworkz");
		
		EntityManager entityManager=managerFactory.createEntityManager();
		
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		entityManager.close();
		managerFactory.close(); 
		
		College coll=new College();
		
		coll.setId(3);
		coll.setCollegeName("VVV School");
		coll.setCollegeId("ABC0012015");
		coll.setAddress("Sedam,Gulbarga");
		
		//student.setCollege(coll.getId());
		
		EntityManagerFactory managerFactory1= Persistence.createEntityManagerFactory("college_xworkz");
		
		EntityManager entityManager1=managerFactory1.createEntityManager();
		
		EntityTransaction transaction1=entityManager1.getTransaction();
		transaction1.begin();
		entityManager1.persist(coll);
		transaction1.commit();
		entityManager1.close();
		managerFactory1.close();
	}
}
