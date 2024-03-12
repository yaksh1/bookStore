package com.bookecommerce.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookecommerce.Query.Query;
import com.bookecommerce.entity.UserDetails;

public class UserDAO {
	
	private static Connection con;
	public UserDAO(Connection con){
		this.con=con;
	}
	
	public boolean addUser(UserDetails user) {
		boolean done=false;
		PreparedStatement st=null;
		String query = Query.insert;
		try {
			// check if user exists
			boolean exists = AlreadyExists(user.getUemail());
			if(exists) {
				return done;
			}
			st=con.prepareStatement(query);
			st.setString(1, user.getUname());
			st.setString(2, user.getUemail());
			st.setString(3, user.getUpassword());
			st.setString(4, user.getUcontact());
			
			
			int exe = st.executeUpdate();
			if(exe>0) {
				done=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return done;
	}
	
	public boolean AlreadyExists(String email) {
		boolean exists=true;
		PreparedStatement st=null;
		String query=Query.exists;
		
		try {
			st=con.prepareStatement(query);
			st.setString(1, email);
			ResultSet exe = st.executeQuery();
			if(exe.next()) {
				return exists;
			}
			return !exists;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exists;
	}
	
	public UserDetails validateUser(String email,String pass) {
		UserDetails user=null;
		PreparedStatement st=null;
		String query=Query.loginSelect;
		try {
			st=con.prepareStatement(query);
			st.setString(1, email);
			st.setString(2, pass);
			ResultSet exe = st.executeQuery();
			if(exe.next()) {
				user=new UserDetails(
						exe.getString("user_name"),
						email,
						pass,
						exe.getString("user_contact")
						);
				
			}
			user.setUid(exe.getInt("uid"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
