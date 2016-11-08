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
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/newcust.html";
        
       
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

     
        if (action.equals("join")) {
            url = "/newcust.html";    
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipcode = request.getParameter("zipcode");
            String email = request.getParameter("email");

            // store data in User object
            User user = new User(firstName, lastName, email, address, city, state, zipcode, email);

           
            String message;
            if (firstName == null || lastName == null || email == null || address == null || 
                    city == null || state == null || zipcode == null || email == null ) {
                url = "/newcust.html";
            } 
            else {
                
                url = "/newcust.jsp";
                
            }
            request.setAttribute("user", user);
            
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
      
}
