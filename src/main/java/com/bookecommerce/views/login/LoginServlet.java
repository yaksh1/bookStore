package com.bookecommerce.views.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.bookecommerce.DAO.UserDAO;
import com.bookecommerce.DB.DBconnect;
import com.bookecommerce.HelperFunctions.HelperFunctions;
import com.bookecommerce.entity.UserDetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail = request.getParameter("username");
		String upassword = request.getParameter("password");
		
		//helper functions
		HelperFunctions.checkNull(uemail, "invalidEmail", "login.jsp", null, request, response);
		HelperFunctions.checkNull(upassword, "emptyPassword", "login.jsp", null, request, response);
		
		//session
		HttpSession session = request.getSession();
		//dispatcher
		RequestDispatcher dispatcher = null;
		//Connection
		Connection con;
		
		try {
			con = DBconnect.connect();
			UserDAO dao = new UserDAO(con);
			UserDetails validUser = dao.validateUser(uemail, upassword);
			
			if(validUser!=null) {
				session.setAttribute("name", validUser.getUname());
				session.setAttribute("userD", validUser);
				dispatcher = request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
