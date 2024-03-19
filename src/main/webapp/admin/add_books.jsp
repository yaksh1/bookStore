<!DOCTYPE html>
<%@page import="java.sql.Connection"%>
<%@page import="com.bookecommerce.DB.DBconnect"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Add Book Page</title>

<%@include file="allCss.jsp"%>
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
<input type="hidden" id="Addstatus" value="<%= session.getAttribute("Addstatus") %>">
<%@include file="navbar.jsp" %>
	<div class="main">
		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Add Book</h2>
							
						<form method="post" action="../addbooks" class="register-form" enctype="multipart/form-data"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="bookName" id="bookName"
									placeholder="Book Name" required="required"/>
							</div>
							<div class="form-group">
								<label for="authorName"><i class="zmdi zmdi-email"></i></label>
								<input type="text" name="authorName" id="authorName"
									placeholder="Author Name" required="required" />
							</div>
							<div class="form-group">
								<label for="price"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="price" id="price" placeholder="Price"
									required="required" />
							</div>
							<div class="form-group">
								<label for="inputState"><i class="zmdi zmdi-lock"></i></label> <select
									name="btype" id="inputState" class="form-control">
									
						
									<option selected> Select Book Categories</option>
									<option value="New">New Book</option>
								</select>
							</div>
							<div class="form-group">
								<label for="inputState"><i class="zmdi zmdi-lock"></i></label> <select
									name="bstatus" id="inputState" class="form-control">
									<option selected>Book Status</option>
									<option value="Active">Active</option>
									<option value="Inactive">Inactive</option>
								</select>
							</div>
							<p>Upload Photo</p>
							<div class="form-group">
								<label for="file"></label> <input
									name="bimg" type="file" id="file" class="form-control-file" />
							</div>



							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Add" required="required"/>
							</div>
						</form>
					</div>

				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
	<script type="text/javascript">
	var Addstatus = document.getElementById("Addstatus").value;
	var status = document.getElementById("status").value;
	if(Addstatus=="success"){
		swal("Congrats","Book added successfully","success");
	}else if(Addstatus=="fail"){
		swal("Sorry","Something went wrong","error");
	}else if(status==null){
		
	}
	else if(status=="EmptyName"){
		swal("Sorry","Please enter the book name","error");
	}else if(status=="EmptyAuthor"){
		swal("Sorry","Please enter book author","error");
	}else if(status=="EmptyFile"){
		swal("Sorry","Please upload a book photo","error");
	}else if(status=="EmptyPrice"){
		swal("Sorry","Please enter the book price","error");
	}
	</script>

</body>
</html>