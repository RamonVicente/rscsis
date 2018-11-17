a<%-- 
    Document   : Login
    Created on : 16/11/2018, 16:04:12
    Author     : Marcelo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
  
<div>
    <form method="POST" action="acesso" >
        <h3>Login</h3>

        Login:
        <br>
        <input type="text" id="login" placeholder="Login" size="30">
        <br><br>

        Senha:
        <br>
        <input type="pasword" id="senha" placeholder="Senha" size="30">
        <br><br>

        <button type="submit" id="enviar" class="btn btn-default">Entrar</button>
        <br>
    </form>
</div>

</body>
</html>
