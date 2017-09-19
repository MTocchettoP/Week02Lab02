<%-- 
    Document   : login
    Created on : Sep 19, 2017, 8:40:00 AM
    Author     : 733196
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Login</title>
    </head>
    <body>
      
        <h1>Login</h1>
        <div>
            <form action="ageCalculator" method="post">
                Username: <input type="text" name="username" ><br>
               Password: <input type="text" name="password" ><br>
                <input type="submit" value="login">
            </form>
            
        </div>
        ${errorMessage}
        
    </body>
</html>
