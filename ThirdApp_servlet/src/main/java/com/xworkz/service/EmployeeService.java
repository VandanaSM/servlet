package com.xworkz.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dao.EmployeeDao;
import com.xworkz.dto.EmployeeDto;

public class EmployeeService extends HttpServlet {

	EmployeeDao dao=new EmployeeDao();

	public Boolean saveEmployee(EmployeeDto dto) {
		System.out.println("-----------service class----------------");
		//write business logic to generate id
		Random random=new Random();
		int idNumber=random.nextInt() + 2;
		//setting random id to employee id
		dto.setId(idNumber);
		//passing dto to dao class
		Boolean result=dao.saveEmployee(dto);
		System.out.println("------------return to controller---------------------------");
		return result;
	}
}