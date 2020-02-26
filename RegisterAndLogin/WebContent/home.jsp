<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">


		<!-- <div
			class="cover-container d-flex w-100 h-100 p-5 mx-auto flex-column"> -->



			<nav class="navbar  navbar-expand-md navbar-dark bg-dark"
				style="opacity: 0.5"; >
				<div
					class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link"
							href="login.jsp" style="font-family:italica; color: gold">LOGIN</a></li>
					</ul>
				</div>
				<div class="mx-auto order-0">
					<a class="navbar-brand mx-auto" href="home.jsp" style="font-family:cursive; color:gold">Homepage</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target=".dual-collapse2">
						<span class="navbar-toggler-icon"></span>
					</button>
				</div>

				<div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							href="reg.jsp" style="font-family: italica; color: gold">Register
								</a></li>
					</ul>
				</div>
			</nav>
		</div>
<div class="text-centre" align="center">
<h3><p><b><u>MVC Module Architecture</u></b></p></h3>
<h4><p style="color:green">The MVC module type implements the model-view-controller pattern, which separates an application into three main components:</p></h4>

<h4><p><b>* Models</b> <i style="color:green">implement the domain logic and often store and retrieve data from the database.</i></p></h4>
<h4><p><b>* Views</b><i style="color:green"> render the module's user interface (UI). Typically, views are created based on data provided by the model.
</i></p></h4>
<h4><p><b>* Controllers</b> <i style="color:green">handle user interaction, retrieve and update the model, and select the view to use.
Although the composition of the presentation layer is different, the logical architecture of an MVC module is similar to that of a Web Forms module.</i></p></h4>

</div>


</body>
</html>