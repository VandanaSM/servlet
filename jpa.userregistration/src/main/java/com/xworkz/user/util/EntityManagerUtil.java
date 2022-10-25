package com.xworkz.user.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {  

	private EntityManager entityManager;
	
    public EntityManagerUtil() {
    	
    	entityManager=Persistence.createEntityManagerFactory("userUnit").createEntityManager();
    	//EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("user"); //user persistence unit name
    	//entityManager=entityManagerFactory.createEntityManager();
    	System.out.println("---------------EntityManagerUtil--------------" +entityManager);
	} 
    
    public EntityManager getEntityManager() {
    	System.out.println("---------------getEntityManager--------------" +entityManager);
    	return entityManager;
    }
}
