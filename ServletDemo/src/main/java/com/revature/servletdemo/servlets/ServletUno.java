package com.revature.servletdemo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ServletUno extends HttpServlet{

	private static final long serialVersionUID = -465940822375880622L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("In the get method of ServletUno");
        //resp.setContentType("text/html";)
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
	
}
