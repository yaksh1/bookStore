package com.bookecommerce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookecommerce.Query.Query;
import com.bookecommerce.entity.BookDetails;

public class BookDAO {
	private static Connection conn;

	public BookDAO(Connection con) {
		this.conn=con;

	}
	
	public boolean addBook(BookDetails book) {
		
		PreparedStatement st =null;
		String q = Query.addBook;
		try {
			st=conn.prepareStatement(q);
			st.setString(1,book.getBookName() );
			st.setString(2,book.getBookAuthor() );
			st.setString(3, book.getPrice());
			st.setString(4,book.getBookCategory() );
			st.setString(5, book.getStatus());
			st.setString(6,book.getPhotoName());
			st.setString(7, book.getEmail());
			
			int add = st.executeUpdate();
			if(add>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	public List<BookDetails> getBooks(){
		List<BookDetails> l = new ArrayList<>();
		BookDetails b = null;
		String query = Query.getBook;
		
		try {
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet set = st.executeQuery(query);
			while(set.next()) {
				b=new BookDetails();
				b.setBookId(set.getInt("bookId"));
				b.setBookName(set.getString("bookname"));
				b.setBookAuthor(set.getString("author"));
				b.setPrice(set.getString("price"));
				b.setBookCategory(set.getString("bookCategory"));
				b.setStatus(set.getString("status"));
				b.setPhotoName(set.getString("photo"));
				b.setEmail(set.getString("email"));
				l.add(b);
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	public BookDetails editBook(int id) {
		PreparedStatement st=null;
		String q = Query.editBook;
		BookDetails b = null;
		try {
			st = conn.prepareStatement(q);
			st.setInt(1, id);
			ResultSet set = st.executeQuery();
			while(set.next()) {
				b=new BookDetails();
				b.setBookId(set.getInt("bookId"));
				b.setBookName(set.getString("bookname"));
				b.setBookAuthor(set.getString("author"));
				b.setPrice(set.getString("price"));
				b.setBookCategory(set.getString("bookCategory"));
				b.setStatus(set.getString("status"));
				b.setPhotoName(set.getString("photo"));
				b.setEmail(set.getString("email"));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return b;
	}
	
	
}
