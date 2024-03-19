
<%@page import="com.bookecommerce.entity.BookDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.bookecommerce.DB.DBconnect"%>
<%@page import="com.bookecommerce.DAO.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: All Books</title>
<%@include file="allCss.jsp"%>
<style>
.btn-custom2 {
	border-color: #AFCBD5;
	border-width: 2px;
}

.btn-custom2:hover {
	background-color: #AFCBD5;
	color: white;
}

.btn-custom3 {
	border-color: #ff5271;
	border-width: 2px;
}

.btn-custom3:hover {
	background-color: #ff5271;
	color: white;
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<h3 class="text-center">Hello Admin</h3>
	<table class="table table-hover">
		<thead>
			<tr><th scope="col">ID</th>
				<th scope="col">Image</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author Name</th>
				<th scope="col">Price</th>
				<th scope="col">Book Categories</th>
				<th scope="col">Status</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<%
			BookDAO dao = new BookDAO(DBconnect.connect());
			List<BookDetails> l = dao.getBooks();
			for (BookDetails b : l) {
			%>
				<tr>
				<td><%=b.getBookId() %></td>
				<td><img src="../book/<%=b.getPhotoName()%>" style="width:100px;height: 150px;"></td>
				<td><%=b.getBookName() %></td>
				<td><%=b.getBookAuthor()%></td>
				<td><%=b.getPrice()%></td>
				<td><%=b.getBookCategory() %></td>
				<td><%=b.getStatus() %></td>
			
				<td><a href="editBooks.jsp?id=<%=b.getBookId() %>" class="btn btn-custom2">Edit</a> <a href="#"
					class="btn btn-custom3">Delete</a></td>
			</tr>
			<%
			}
			%>
			
		</tbody>
	</table>

</body>
</html>