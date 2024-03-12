<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="allComponent/allCss.jsp"%>
<style type="text/css">
.back-img {
	background-image: url("images/b.jpg");
	height: 40vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}

.btn-custom {
	border-color: #AFCBD5;
	border-width: 2px;
}

.btn-custom:hover {
	background-color: #AFCBD5;
	color: white;
}

.card-ho {
	border-radius: 16px;
	width: 120%;
	border-width: 0px;
	background-color: #dadeff;
}

.card-ho:hover {
	background-color: #cfd4fc;
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

.btn-view-all{
	background-color: #edcc6f;
}

.btn-view-all:hover{
	background-color: #e3be54;
}

body{

background-color: #f7f7f7;
background-image: url("images/gradient.jpg");
height: 100%;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;

}
</style>
</head>
<body>
	<%@include file="allComponent/navbar.jsp"%>

	<div class="container-fluid back-img">
		<h1 class="text-center text-white p-3">
			<i class="fa-solid fa-book-open"></i> EBook Management System
		</h1>
	</div>

	<!-- Recent Books -->
	<div class="container p-4">
		<h3 class="text-center">Recent Books</h3>
		<div class="row">
			<div class="col-md-3 card-div">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="" src="images/2.jpg" height="300px" width="250px">
						<div class="card card-in" style="">
							<div class="card-body text-center">
								<h3>Java Programming</h3>
								<p>Author name</p>
								<p>Category name</p>
								<div class="col">
									<a href="" class="btn btn-custom">Add to cart</a> <a href=""
										class="btn btn-custom">View Details</a> <a href=""
										class="btn btn-custom">Price</a>

								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 card-div">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="" src="images/1.jpg" height="300px" width="250px">
						<div class="card card-in" style="">
							<div class="card-body text-center">
								<h3>Java Programming</h3>
								<p>Author name</p>
								<p>Category name</p>
								<div class="col">
									<a href="" class="btn btn-custom">Add to cart</a> <a href=""
										class="btn btn-custom">View Details</a> <a href=""
										class="btn btn-custom">Price</a>

								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 card-div">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="" src="images/1.jpg" height="300px" width="250px">
						<div class="card card-in" style="">
							<div class="card-body text-center">
								<h3>Java Programming</h3>
								<p>Author name</p>
								<p>Category name</p>
								<div class="col">
									<a href="" class="btn btn-custom">Add to cart</a> <a href=""
										class="btn btn-custom">View Details</a> <a href=""
										class="btn btn-custom">Price</a>

								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 card-div">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="" src="images/1.jpg" height="300px" width="250px">
						<div class="card card-in" style="">
							<div class="card-body text-center">
								<h3>Java Programming</h3>
								<p>Author name</p>
								<p>Category name</p>
								<div class="col">
									<a href="" class="btn btn-custom">Add to cart</a> <a href=""
										class="btn btn-custom">View Details</a> <a href=""
										class="btn btn-custom">Price</a>

								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- Recent Books view more -->
	<div class="text-center">
	<a href="#" class="btn btn-view-all btn-lg">view all</a>
	</div>
	<hr>
	</div>
	
	
<%@include file="allComponent/footer.jsp" %>
</body>
</html>