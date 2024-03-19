package com.bookecommerce.entity;

public class BookDetails {
	private int bookId;
	private String bookName;
	private String BookAuthor;
	private String price;
	private String bookCategory;
	private String status;
	private String photoName;
	private String email;

	
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + ", price="
				+ price + ", bookCategory=" + bookCategory + ", status=" + status + ", photoName=" + photoName
				+ ", email=" + email + "]";
	}
	public BookDetails( String bookName, String bookAuthor, String price, String bookCategory, String status,
			String photoName, String email) {
		super();
		
		this.bookName = bookName;
		BookAuthor = bookAuthor;
		this.price = price;
		this.bookCategory = bookCategory;
		this.status = status;
		this.photoName = photoName;
		this.email = email;
	}
	/**
	 * 
	 */
	public BookDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the bookAuthor
	 */
	public String getBookAuthor() {
		return BookAuthor;
	}
	/**
	 * @param bookAuthor the bookAuthor to set
	 */
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the bookCategory
	 */
	public String getBookCategory() {
		return bookCategory;
	}
	/**
	 * @param bookCategory the bookCategory to set
	 */
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the photoName
	 */
	public String getPhotoName() {
		return photoName;
	}
	/**
	 * @param photoName the photoName to set
	 */
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
