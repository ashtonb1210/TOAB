/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashton
 */
public class LoginServlet extends HttpServlet {
	
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		
		if(un.equals("jsmith@toba.com") && pw.equals("letmein"))
		{
			response.sendRedirect("Account_Activity.html");
			
		}
		else
		{
			response.sendRedirect("Login_Failure.html");
			
		}
	}
}

  