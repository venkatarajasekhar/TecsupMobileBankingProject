<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,BankServices.modelo.SecurityQuestion"%>
<%@page import="java.util.*,BankServices.modelo.Customer"%>
<!DOCTYPE HTML>
<!--
	Strongly Typed by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Banco Credito del Peru</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/css/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 8]><script src="assets/css/ie/respond.min.js"></script><![endif]-->
		<link rel="icon" type="image/x-icon" href="images/favicon.ico" />
	</head>
	<body class="homepage">
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header-wrapper">
					<div id="header" class="container">

						<!-- Logo -->
							<h1 id="logo"><a href="index.html">Tecsup Bank Project</a></h1>
							<p>Login to view Monthly Statement</p>

						<!-- Nav -->
							
					</div>
				</div>
				
							<!-- Main -->
				<div id="main-wrapper">
					<div id="main" class="container">
						<div class="row">

							<!-- Content -->
								<div id="content" class="12u 12u(mobile)">

									<!-- Post -->
										<article class="box post">
											<header>
												<h2>Welcome! <strong>Login</strong> </h2>
												<%String res = (String) request.getAttribute("RESUL");
													out.println(res);
												%>
											</header>
											<form action="Login" method="post" id="loginForm">
											<%
											Customer customer = (Customer)request.getAttribute("user");
											if (customer == null)
											{
												out.println( "<h3>Username</h3> <input type=text id=username name=username><h3>Password</h3><input type=password id=password name=password>");
											}
												
											
											else if (customer.loggedIn == false)
												{
													SecurityQuestion question = customer.getRandomSecurityQuestion();
													out.println( " <input type=hidden id=username name=username value=" + customer.getIdUser());
													out.println( " <input type=hidden id=password name=password value=" + customer.getPassword());
													out.println( "<h3>SecurityQuestion</h3> <input type=hidden id=securityQuestionID name=securityQuestionID value=");
													out.println(question.getIdQuestion());
													out.println("><h3>");
													out.println(question.getQuestion());
													out.println("</h3><input type=text id=securityAnswer name=securityAnswer>");
												}
											else
											{
												out.println("Thanks for logging in, " + customer.getName());
											}
											
													
												%>

											<br>
											<br>
											<input type="submit">
											
											</form>
		

										</article>
								</div>



						</div>
					</div>
				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/skel-viewport.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>