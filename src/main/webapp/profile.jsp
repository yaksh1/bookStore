<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="com.bookecommerce.entity.UserDetails"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="allComponent/allCss.jsp" %>
<style>
body{
	background-color: #eee;
}
.card{
	background-color: #fff;
	width: 500px;
	height:500px;
	justify-content:center;
	border-radius: 33px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
	padding: 2rem !important;
}
.top-container{
	display: flex;
	align-items: center;
}
.profile-image{
	border-radius: 10px;
	border: 2px solid #5957f9;
}
.name{
	font-size: 18px;
	font-weight: bold;
	color: #272727;
	position: relative;
	top: 8px;
}
.mail{
	font-size: 16px;
	color: grey;
	position: relative;
	top: 2px;
}
.middle-container{

	background-color: #eee;
	border-radius: 12px;

}
.middle-container:hover {
	border: 1px solid #5957f9;
}


.current-balance{
	font-size: 24px;
	color: #272727;
	font-weight: bold;
}

.recent-border{
	border-left: 2px solid #5957f9;
	display: flex;
	align-items: center;

}
.recent-border:hover {
	border-bottom: 1px solid #dee2e6!important;
}

.recent-orders{
	font-size: 16px;
	font-weight: 700;
	color: #5957f9;
	margin-left: 2px;
}

.wishlist{
	font-size: 16px;
	font-weight: 700;
	color: #272727;

}
.wishlist-border:hover{
	border-bottom: 1px solid #dee2e6!important;
}
.fashion-studio{
	font-size: 16px;
	font-weight: 700;
	color: #272727;
}
.fashion-studio-border:hover {
	border-bottom: 1px solid #dee2e6!important;
}
</style>
</head>
<body>

<%UserDetails user = (UserDetails) session.getAttribute("userD"); %>
<div class="container-fluid d-flex justify-content-center mt-5">

	<div class="card">
		
		<div class="top-container justify-content-center">
			
			<img src="https://i.imgur.com/G1pXs7D.jpg" class="img-fluid profile-image" width="150">
			
			
		</div>
		<%
		String[] l1={"ID: ","Name: ","Email: ","Mobile: "};
		String[] l2={user.getUid()+"",user.getUname(),user.getUemail(),user.getUcontact()};
		for(int i=0;i<4;i++){%>
			<div class="middle-container d-flex justify-content-between align-items-center mt-3 p-2">
			
			
			<div class="  text-right ">
			<span class="current-balance"><%=l1[i]%></span>
		
		</div> 

		
		<div class="  text-right mr-2">
			<span class="current-balance"><%= l2[i]%></span>
		
		</div>
		

</div><%
			
		} %>
		
	</div>
	
</div>
</body>
</html>