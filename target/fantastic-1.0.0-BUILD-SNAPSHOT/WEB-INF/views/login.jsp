<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>
            Login Page  
        </h1>
        <form method="post" action="">
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="username" placeholder="username" required="required"/></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="password" placeholder="password" required="required"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="reset" value="Reset"/>&nbsp;&nbsp;<input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>
        
        <a href="/signup">Create new Account</a>
    </body>
</html>
