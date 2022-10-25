package com.xworkz.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.EmployeeDto;
import com.xworkz.service.EmployeeService;

public class EmployeeController extends HttpServlet  {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//from ui we can fetch string data only not int data 
		//String id=req.getParameter("id");
		//Integer idint=Integer.parseInt(id);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		//create dto object then set all ui data into the 
		EmployeeDto dto=new EmployeeDto();
	//	dto.setId(idint);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(password);
		
		//pass dto service class
		EmployeeService service=new EmployeeService();
		Boolean result=service.saveEmployee(dto);
		//
		//RequestDispatcher dispatcher=null;
		if(result==true) {
		resp.getWriter().println("Data inserted successfully");
		}else {
	    resp.getWriter().println("Data is not inserted");
		}
	}
}
