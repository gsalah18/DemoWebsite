<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container" style="padding: 20px">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<h1>Login Page</h1>
			</div>
		</div>

		<div class="row" style="padding-top: 100px">
			<div class="col-md-8 offset-md-2">
				<form method="POST" action="login">
					<div class="form-group">
						<label for="username">Username</label> <input name="username"
							id="username" placeholder="Enter Your Username"
							class="form-control">
						<h3 style="color: red">${error}</h3>
					</div>
					<div class="form-group">
						<label for="password">Password</label> <input name="password"
							id="password" type="password" class="form-control"
							placeholder="Entr Your Password">
					</div>
					<div class="form-group form-check">
						<input id="checkbox" name="rememberMe" class="form-check-input"
							type="checkbox"> <label for="checkbox">Remember
							Me</label>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>