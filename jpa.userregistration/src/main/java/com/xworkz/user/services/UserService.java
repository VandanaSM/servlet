package com.xworkz.user.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.dto.User;
import com.xworkz.user.util.EntityManagerUtil;

public class UserService implements UserInf{


	EntityManagerUtil entityManagerUtil=new EntityManagerUtil();
	
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction=entityManagerUtil.getEntityManager().getTransaction();
		entityTransaction.begin();
		entityManagerUtil.getEntityManager().persist(user);
		entityTransaction.commit();
		entityManagerUtil.getEntityManager().close();
	}

	public User findUserById(int UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(User User) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(int UserId) {
		// TODO Auto-generated method stub
		
	}

	public User logInUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User findByUserEmail(String email) {
		//select * from user where email=? and password=?  values set by set method in jdbc 
		Query query=entityManagerUtil.getEntityManager().createNamedQuery("findbyEmail");
		//setting parameter for jpql query
		query.setParameter("email", email);
		//for encription of password
		//BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		//query.setParameter("password",encoder.encode(password));
		List<User> listUser =query.getResultList();
		System.out.println("-----------count of list -------------" +listUser.size());
		User retUser=null;
		for(User user:listUser){
			retUser= user;
		}
		
		return retUser;
	}
	

}
