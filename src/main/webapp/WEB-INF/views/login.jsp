<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<div class="login">
		<h2 class="form-signin-heading">Login Page</h2>
		<form method="POST"
			action='<spring:url value="/j_spring_security_check"></spring:url>'>

			<div class="form-group">
				<label for="username">UserName:</label> <input type="text"
					id="j_username" name="j_username" placeholder="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					id="j_password" name="j_password" placeholder="password">
			</div>
			<input type="submit" value="Submit" /> <input type="reset"
				value="Reset" />
		</form>
	</div>



	<a href="/signup">Create new Account</a>
	<!--    </body>
</html>-->