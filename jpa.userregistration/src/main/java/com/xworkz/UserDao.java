package com.xworkz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.dto.User;
import com.xworkz.user.services.UserService;

public class UserDao {

	public static void main(String[] args) {
		
		User usr=new User();
		usr.setName("Raja");
		usr.setEmail("raja@gmail.com");
		usr.setAge(25);
		//yyyy-mm-dd
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date dob;
		try {
			dob = (Date)dateFormat.parse("1987-06-13");
			usr.setDateOfBirth(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//password encoding
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		usr.setPassword(encoder.encode("abc@1904"));
		
		UserService userService =new UserService();
		//userService.saveUser(usr);
		User user=userService.findByUserEmail("raja@gmail.com");
		System.out.println("----------user--------" + user.toString());
		
	}
}
