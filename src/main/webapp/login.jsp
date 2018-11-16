<%-- 
    Document   : login
    Created on : 12/11/2018, 14:13:01
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <head>
  <title>Página Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="style.css">
  <link rel="LoginDemi.java">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    </head>
    <body>
        
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">W</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Trwe.html">Home</a></li>
      <li><a href="Login.html">Login</a></li>
      <li><a href="Register.html">Cadastro</a></li>
    </ul>
  </div>
</nav>
  
   <div class="container" style=" border: 8px double; width:50%">
    
    <form  method="POST" action="NewServlet" style="margin-left:35%; margin-bottom:10%; margin-top:10%;">
        
        <h3>Login</h3>

        Login:
        <br>
        <input type="text" name="login" placeholder="Login" size="30">
        <br><br>

        Senha:
        <br>
        <input type="pasword" name="senha" placeholder="Senha" size="30">
        <br><br>

        <button type="submit" value="Login" class="btn btn-default">Entrar</button>
        <br>
    </form>
</div>

    </body>
</html>
