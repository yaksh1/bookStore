package com.bookecommerce.admin;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.bookecommerce.DAO.BookDAO;
import com.bookecommerce.DB.DBconnect;
import com.bookecommerce.HelperFunctions.HelperFunctions;
import com.bookecommerce.entity.BookDetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

/**
 * Servlet implementation class BooksAdd
 */
@WebServlet("/addbooks")
@MultipartConfig
public class BooksAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BooksAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String price= request.getParameter("price");
		String btype= request.getParameter("btype");
		String bstatus= request.getParameter("bstatus");
		Part part = request.getPart("bimg");
		String fileName = part.getSubmittedFileName();
		
		//Dispatcher
		RequestDispatcher dispatcher = null;
		//Helper functions
//		HelperFunctions.checkNull(bookName, "EmptyName", "admin/add_books.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(authorName, "EmptyAuthor", "admin/add_books.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(price, "EmptyPrice", "admin/add_books.jsp", dispatcher, request, response);
		HelperFunctions.checkNull(fileName, "EmptyFile", "admin/add_books.jsp", dispatcher, request, response);
		
		//Book Entity
		BookDetails book = new BookDetails(bookName, authorName, price, btype, bstatus, fileName,"admin");
		System.out.println(book.toString());
		
		// Connection
		Connection con = null;
		
		HttpSession session = request.getSession();
		
		try {
			con = DBconnect.connect();
			BookDAO dao = new BookDAO(con);
			boolean added = dao.addBook(book);
			if(added) {
				String path = getServletContext().getRealPath("") +"book";
				File file = new File(path);
				part.write(path+File.separator+fileName);
				session.setAttribute("Addstatus", "success");
				response.sendRedirect("admin/add_books.jsp");
			}else {
				session.setAttribute("Addstatus", "fail");
				response.sendRedirect("admin/add_books.jsp");
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
