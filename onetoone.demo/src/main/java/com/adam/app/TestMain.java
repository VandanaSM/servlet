package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String[] args) {
	
	
	 
User user=new User();
user.setUserName("shashira sir");


Address address=new Address();
address.setArea("btm");
address.setCity("btm");

//setting address to user object(which map onetoone)
user.setAddress(address);	
	//below 3 lines is equal to entitymanagerfactory
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory factory	=configuration.buildSessionFactory();
	//session is equal to entitymanager
	Session session=factory.openSession();
	//Transactiob is equal to entitytransaction in jpa
	Transaction transaction=session.beginTransaction();
	session.save(user); //save method is used to persist method in jpa
	session.save(address);
	
	transaction.commit();
	session.close();
	
	
	
	
	
	

	
	
	
	
	
}
}
