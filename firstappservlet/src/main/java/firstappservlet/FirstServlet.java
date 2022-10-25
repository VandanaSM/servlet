package firstappservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp); //should give at first time only
		//to read UI 
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		
		System.out.println("----------firstName-----------" +firstName);
		System.out.println("----------lastName-----------" +lastName);
		
		resp.getWriter().print("<h1>WELCOME " + firstName + " " + lastName + " TO Xworkz<h1>");
	
	}
}
