/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashton
 */
public class NewCustomer extends HttpServlet {

   @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("firstname");
		String last = request.getParameter("lastname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
                String zipcode = request.getParameter("zipcode");
		String email = request.getParameter("email");
               
                if("".equals(first))
		{
                        String someMessage = "Error !";
                        PrintWriter out = response.getWriter();
                        out.print("<html><head>");
                        out.print("<script type=\"text/javascript\">alert(" + someMessage + ");</script>");
                        out.print("</head><body></body></html>");
			response.sendRedirect("index.html");
                        
			
		}
		else
		{
			
			response.sendRedirect("success.html");
		}
	}
	}
