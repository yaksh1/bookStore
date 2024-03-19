<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<%@include file="allCss.jsp"%>
<style>
.card-ho {
	border-radius: 16px;
	height: 120%;
	/* width: 120%; */
	border-width: 0px;
	/* background-color: #dadeff; */
}



.add{
background-color:#ffdada ;
color:#f75248;
}

.add:hover{
background-color: #fab4b4;
}
.all{
background-color:#e4ffda ;
color:#8cfc53;
}

.all:hover{
background-color: #cffab4;
}

.order{
background-color:#faf8a0 ;
color:#ffcc66;
}
.order:hover{
background-color:#f7f572 ;
}

.card-body{
margin-top: 50px;
}

.card-in {
	border-radius: 16px;
	margin-top: 10px;
	border-width: 0px;
}

.card-div {
	margin-left: 50px;
	margin-right: 50px;
	margin-top: 40px;
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<div class="container">
		<div class="row p-5">
			<div class="col-md-3 card-div" >
			<a href="add_books.jsp" style="text-decoration: none;color:black;">
				 <div class="card card-ho add">
					<div class="card-body text-center">

						<i class="fa-solid fa-square-plus fa-5x" ></i><br>
						<h3>Add Books</h3>
						----------------

					</div>
				</div> 
				</a>
			</div>
			<div class="col-md-3 card-div" >
			<a href="all_books.jsp" style="text-decoration: none;color:black;">
				 <div class="card card-ho all text-center">
					<div class="card-body text-center">

						<i class="fa-solid fa-book fa-5x" ></i><br>
						<h3>All Books</h3>
						----------------

					</div>
				</div> 
				</a>
			</div>
			<div class="col-md-3 card-div" >
			<a href="orders.jsp" style="text-decoration: none;color:black;">
				 <div class="card card-ho order">
					<div class="card-body text-center">

						<i class="fa-solid fa-box-archive fa-5x" ></i><br>
						<h3>All Orders</h3>
						----------------

					</div>
				</div> 
				</a>
			</div>
			
		</div>
	</div>

<div style="margin-top: 410px;">
<%@include file="footer.jsp" %>
</div>

</body>
</html>