package com.bookecommerce.views.register;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name" );
		String upassword = request.getParameter("pass" );
		String uemail = request.getParameter("email" );
		String ucontact = request.getParameter("contact");
		String urepass = request.getParameter("re_pass");
		
		//user
		UserDetails user = new UserDetails(uname,uemail,upassword,ucontact);
		
		//dispatcher
		RequestDispatcher dispatcher=null;
		
		//Connection 
		Connection con=null;
		
		//helper functions to do server-side-validation
		HelperFunctions.checkEqual(upassword,urepass,"register.jsp",dispatcher,request,response);
		HelperFunctions.checkNumberisNum(ucontact, "register.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(uname,"emptyName","register.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(uemail,"emptyEmail","register.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(ucontact,"emptyMobile","register.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(upassword,"emptyPassword","register.jsp", dispatcher, request, response);
		
	
		
		try {
			// connection
			con= DBconnect.connect();
			
			//user DAO
			UserDAO dao = new UserDAO(con);
			boolean added = dao.addUser(user);
			if(added) {
				HttpSession session = request.getSession();
				session.setAttribute("RegisterStatus", "success");
				response.sendRedirect("login.jsp");
				
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("RegisterStatus", "failed");
				response.sendRedirect("register.jsp");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
