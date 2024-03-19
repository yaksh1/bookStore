package com.bookecommerce.entity;

public class UserDetails {
	private int uid;
	private String uname;
	private String uemail;
	private String upassword;
	private String ucontact;
	public UserDetails() {
		
	}
	public UserDetails(String uname,String uemail,String upassword,String ucontact){
		this.uname=uname;
		this.uemail=uemail;
		this.upassword=upassword;
		this.ucontact=ucontact;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getUid() {
		return uid;
	}
	public String getUcontact() {
		return ucontact;
	}
	public String getUemail() {
		return uemail;
	}
	public String getUname() {
		return uname;
	}
	public String getUpassword() {
		return upassword;
	}
	@Override
	public String toString() {
		return "name: "+uname+" email: "+uemail+" pass: "+upassword+" mobile: "+ucontact;
	}
}
