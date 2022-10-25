package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.dto.EmployeeDto;

public class EmployeeDao  {
//in spring boot 
	public Boolean saveEmployee(EmployeeDto dto ) {
 
		
		System.out.println("-------------Dao -----------------");
		//jdbc logic 
		String url="jdbc:mysql://localhost:3306/xworkz";
		String username="root";
		String pwd="Xworkzodc@123";
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pstmt=conn.prepareStatement("insert into employee_table values(?,?,?,?)");
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getPassword());
			
			 result=pstmt.executeUpdate();
			//write reps send back to server
			//resp.getWriter().print("employee data inserted.............");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------return to call(service class)----------");	
		return result>=1 ? true :false;
			
		
	}
}
