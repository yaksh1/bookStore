package com.bookecommerce.Query;

public class Query {
	// user queries
	public static String insert = "INSERT INTO userdetails(user_name,user_email,user_password,user_contact) values(?,?,?,?)";
	public static String update = "";
	public static String delete = "";
	public static String select = "SELECT*FROM userdetails";
	public static String exists="SELECT user_email from userdetails where user_email=?";
	public static String loginSelect = "SELECT * FROM userdetails where user_email = ? and user_password = ?";
	
	//book queries
	public static String addBook="INSERT INTO bookdetails(bookname,author,price,bookcategory,status,photo,email) values(?,?,?,?,?,?,?)";
	public static String getBook = "SELECT * FROM bookdetails";
	public static String editBook = "SELECT * FROM bookdetails WHERE bookId = ?";
	
}
