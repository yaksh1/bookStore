<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: All Orders</title>
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
			<tr>
				<th scope="col">Order Id</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">address</th>
				<th scope="col">Phone Number</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author</th>
				<th scope="col">Price</th>
				<th scope="col">Payment type</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>@mdo</td>
				<td>Otto</td>
				<td>@mdo</td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>@mdo</td>
				<td>Otto</td>
				<td>@mdo</td>

			</tr>
			<tr>
				<th scope="row">3</th>
				<td>Larry</td>
				<td>the Bird</td>
				<td>@twitter</td>
				<td>Otto</td>
				<td>@mdo</td>
				<td>@mdo</td>
				<td>Otto</td>
				<td>@mdo</td>

			</tr>
		</tbody>
	</table>

</body>
</html>