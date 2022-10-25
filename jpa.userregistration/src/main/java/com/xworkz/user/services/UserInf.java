package com.xworkz.user.services;

import com.xworkz.user.dto.User;

public interface UserInf {

	public void saveUser(User user );
	public User findUserById(int UserId);
	public User updateUser(User User);
	public void deleteUser(int UserId);
	public User logInUser(String email,String password);
	
}
