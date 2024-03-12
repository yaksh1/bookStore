<%@page import="com.bookecommerce.entity.UserDetails"%>
<div class="container-fluid p-3">
	<div class="row">
		<div class="col-md-7 text-logo">
			<h3 class="text-logo"><i class="fa-solid fa-book-open"></i> E-Books</h3>
		</div>
		<div class="col-md-2">
			<form class="d-flex" role="search">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</form>
		</div>
		<div class="col-md-3" style="padding-left: 200px;">
			
			<%UserDetails user = (UserDetails) session.getAttribute("userD"); 
			if(user==null){%>
				<a href="login.jsp" class="btn btn-success"><i class="fa-solid fa-user"></i> Login</a>
				<a href="register.jsp"
				class="btn btn-primary"><i class="fa-regular fa-user"></i> Register</a>
				
				<%
			}else{%>
				<a href="profile.jsp" class="btn btn-custom" 
				type="submit"><i class="fa-solid fa-user"></i> Profile</a> <a href="logout"
				class="btn" style="margin-left: 8px;background-color: #ff5271;color: white;" type="submit"><i class="fa-regular fa-user"></i> Logout</a><%
			}
			%>
			
			
			
		</div>
	</div>
</div>



<nav class="navbar navbar-expand-lg navbar-dark bg-custom" >
	<div class="container-fluid">
	
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#"><i class="fa-solid fa-house"></i> Home</a></li>
				<li class="nav-item "><a class="nav-link active" href="#"><i class="fa-solid fa-book"></i> Recent
						Books</a></li>
				<li class="nav-item "><a class="nav-link active" href="#"><i class="fa-solid fa-book"></i> New
						Books</a></li>

				<li class="nav-item active"><a class="nav-link active" href="#"><i class="fa-solid fa-book"></i> Old
						Books</a></li>
			</ul>
			<form class="d-flex" role="search">
				<button class="btn btn-light m-2" type="submit"><i class="fa-solid fa-gear"></i> Setting</button>
				<button class="btn btn-light m-2"  type="submit"><i class="fa-solid fa-address-card"></i> Contact us</button>
			</form>
		</div>
	</div>
</nav>