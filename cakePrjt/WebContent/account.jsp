<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Account</title>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<link href="${ctx}/static/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="${ctx}/static/css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- js -->
<script src="${ctx}/static/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/bootstrap-3.1.1.min.js"></script>
<!-- //js -->	
<!-- cart -->
<script src="${ctx}/static/js/simpleCart.min.js"> </script>
<!-- cart -->
</head>
<body>
	<!--header-->
	<div class="header">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<h1 class="navbar-brand"><a  href="${ctx }/index.jsp">Yummy</a></h1>
				</div>
				<!--navbar-header-->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="${ctx }/index.jsp" class="active">Home</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Birthday<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Friend</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Lover</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Sister</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Brother</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Kids</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-3">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Chocolate</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Butterscotch</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Strawberry</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Vanilla</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>By Theme</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Heart shaped</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Cartoon Cakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">2-3 Tier Cakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Square shape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Round shape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Photo cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>Weight</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">1 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">1.5 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">2 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">3 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">4 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Large</a></li>
										</ul>
									</div>
								</div>
							</ul>
						</li>
					   <li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Wedding<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Friend</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Lover</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Sister</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Brother</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Kids</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-3">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Chocolate</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Butterscotch</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Strawberry</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Vanilla</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>By Theme</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Heart shaped</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Cartoon Cakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">2-3 Tier Cakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Square shape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Round shape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Photo cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>Weight</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">1 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">1.5 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">2 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">3 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">4 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Large</a></li>
										</ul>
									</div>
								</div>
							</ul>
						</li>				
						<li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Special Offers <b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Friend</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Lover</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Sister</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Brother</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Kids</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-3">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Chocolate</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Butterscotch</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Strawberry</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Vanilla</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>By Theme</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Heart shaped</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Cartoon Cakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">2-3 Tier Cakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Square shape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Round shape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Photo cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>Weight</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">1 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">1.5 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">2 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">3 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">4 kG</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Large</a></li>
										</ul>
									</div>
								</div>
							</ul>
						</li>
						<li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Store<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="col-sm-4">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Friend</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Lover</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Sister</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Brother</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Kids</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-4">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Chocolate</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Butterscotch</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Strawberry</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Vanilla</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>								
									<div class="col-sm-4">
										<h4>Specials</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="${ctx }/products.jsp">Ice cream cake</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Swiss roll</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Ruske kape</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Cupcakes</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Muffin</a></li>
											<li><a class="list" href="${ctx }/products.jsp">Merveilleux</a></li>										
										</ul>
									</div>
								</div>
							</ul>
						</li>								
					</ul> 
					<!--/.navbar-collapse-->
				</div>
				<!--//navbar-header-->
			</nav>
			<div class="header-info">
				<div class="header-right search-box">
					<a href="#"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>				
					<div class="search">
						<form class="navbar-form" action="${ctx }/cake/search">
							<input type="text" class="form-control">
							<button type="submit" class="btn btn-default" aria-label="Left Align">
								Search
							</button>
						</form>
					</div>	
				</div>
				<div class="header-right login">
					<a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
					<div id="loginBox">                
						<form id="loginForm"  action="${ctx }/user/login">
							<fieldset id="body">
								<fieldset>
									<label for="email">Email Address</label>
									<input type="text" name="email" id="email" value="${emaila }">
								</fieldset>
								<fieldset>
									<label for="password">Password</label>
									<input type="password" name="password" id="password"  value="${pswds }">
								</fieldset>
								<input type="submit" id="login" value="Sign in">
								<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
							</fieldset>
							<p>New User ? <a class="sign" href="account.jsp">Sign Up</a> <span><a href="#">Forgot your password?</a></span></p>
						</form>
					</div>
				</div>
				<div class="header-right cart">
					<a href="#"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
					<div class="cart-box">
						<h4><a href="${ctx }/cake/cartDisplay">
							<span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span>) 
						</a></h4>
						<p><a href="${ctx }/cake/deletecart1" class="simpleCart_empty">Empty cart</a></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--//header-->
	<!--account-->
	<div class="account">
		<div class="container">
			<div class="register">
				<form  action ="${ctx }/user/account"> 
					<div class="register-top-grid">
						<h3>Personal information</h3>
						
						<div class="input">
							<span>Name<label>*</label></span>
							<input type="text" name="name"> 
						</div>
						
						<div class="input">
							<span>sex<label>*</label></span>
							<input type="text" name="sex"> 
						</div>
						<div class="input">
							<span>age<label>*</label></span>
							<input type="text" name="age"> 
						</div>
						<div class="input">
							<span>Email Address<label>*</label></span>
							<input type="text" name="email1"> 
						</div>
						<a class="news-letter" href="#">
							<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Sign Up for Newsletter</label>
						</a>
						<div class="clearfix"> </div>
					</div>
				    <div class="register-bottom-grid">
						<h3>Login information</h3>
						<div class="input">
							<span>Password<label>*</label></span>
							<input type="password" name="pswd">
						</div>
						<div class="input">
							<span>Confirm Password<label>*</label></span>
							<input type="password">
						 </div>
					</div>
					
				<div class="clearfix"> </div>
				<div class="register-but">
					<input type="submit" value="submit">
					   <div class="clearfix"> </div>
				</div>
			 </form>
			 
			</div>
	    </div>
	</div>
	<!--//account-->
	
	
	
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-2 footer-grid">
					<h4>company</h4>
					<ul>
						<li><a href="${ctx }/products.jsp">products</a></li>
						<li><a href="#">Work Here</a></li>
						<li><a href="#">Team</a></li>
						<li><a href="#">Happenings</a></li>
						<li><a href="#">Dealer Locator</a></li>
					</ul>
				</div>
				<div class="col-md-2 footer-grid">
					<h4>service</h4>
					<ul>
						<li><a href="#">Support</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Warranty</a></li>
						<li><a href="${ctx }/contact.jsp">Contact Us</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>order & returns</h4>
					<ul>
						<li><a href="#">Order Status</a></li>
						<li><a href="#">Shipping Policy</a></li>
						<li><a href="#">Return Policy</a></li>
						<li><a href="#">Digital Gift Card</a></li>
					</ul>
				</div>
				<div class="col-md-2 footer-grid">
					<h4>legal</h4>
					<ul>
						<li><a href="#">Privacy</a></li>
						<li><a href="#">Terms and Conditions</a></li>
						<li><a href="#">Social Responsibility</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid icons">
					<h4>Connect with Us</h4>
					<ul>
						<li><a href="#"><img src="${ctx }/static/images/i1.png" alt=""/>Follow us on Facebook</a></li>
						<li><a href="#"><img src="${ctx }/static/images/i2.png" alt=""/>Follow us on Twitter</a></li>
						<li><a href="#"><img src="${ctx }/static/images/i3.png" alt=""/>Follow us on Google-plus</a></li>
						<li><a href="#"><img src="${ctx }/static/images/i4.png" alt=""/>Follow us on Pinterest</a></li>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--footer-->
	<div class="footer-bottom">
		<div class="container">
			<p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://www.17sucai.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	</div>
</body>
</html>