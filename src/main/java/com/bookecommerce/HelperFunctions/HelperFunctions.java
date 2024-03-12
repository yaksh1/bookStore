package com.bookecommerce.HelperFunctions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelperFunctions {
	
	public static void checkEqual(String pass,String rePass,String redirect,RequestDispatcher dispatcher,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		if(!pass.equals(rePass)) {
			request.setAttribute("status","passwordDontMatch");
			dispatcher = request.getRequestDispatcher(redirect);
			dispatcher.forward(request, response);
		
		}
	}
	public static void checkNumberisNum(String mobile,String redirect,RequestDispatcher dispatcher,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		if(mobile.length()!=10) {
			request.setAttribute("status","invalidMobileLength");
			dispatcher = request.getRequestDispatcher(redirect);
			dispatcher.forward(request, response);
		
		}
	}
	
	public static void checkNull(String var,String status,String redirect,RequestDispatcher dispatcher,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		if(var==null||var.equals(" ")) {
			request.setAttribute("status",status);
			dispatcher = request.getRequestDispatcher(redirect);
			dispatcher.forward(request, response);
		
		}
	}

}
