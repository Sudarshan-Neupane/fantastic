<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!--<html>
    <head>
        <title><spring:message code="fantastic"/></title>
    </head>
    <body>-->
  <div class="login">
<h2 class="form-signin-heading">Login Page</h2>
<form method="post" action="" class="form-signin">

	<div class="form-group">
		<label for="username">UserName:</label>
	    <input type="text"	class="form-control" id="username" placeholder="username">
	</div>
	<div class="form-group">
		<label for="pwd">Password:</label>
		<input type="password" class="form-control" id="pwd" placeholder="Enter password">
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
	<button type="Reset" class="btn btn-primary">Reset</button>
</form>
</div>


<!-- <form method="post" action="" class="form-signin"> -->
<!-- 	<table> -->
<!-- 		<tr> -->
<!-- 			<td>Username:</td> -->
<!-- 			<td><input type="text" name="username" placeholder="username" -->
<!-- 				required="required" /></td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>Password:</td> -->
<!-- 			<td><input type="password" name="password" -->
<!-- 				placeholder="password" required="required" /></td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>&nbsp;</td> -->
<!-- 			<td><input type="reset" value="Reset" />&nbsp;&nbsp;<input -->
<!-- 				type="submit" value="Login" /></td> -->
<!-- 		</tr> -->
<!-- 	</table> -->
<!-- </form> -->

<a href="/signup">Create new Account</a>
<!--    </body>
</html>-->
