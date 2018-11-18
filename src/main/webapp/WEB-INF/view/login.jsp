<%-- 
    Document   : Login
    Created on : 16/11/2018, 16:04:12
    Author     : Marcelo
--%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Página de Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
 
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">W</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="">Home</a></li>
      <li><a href="">Login</a></li>
      <li><a href="">Cadastro</a></li>
    </ul>
  </div>
</nav>

 
<div class="container" style=" border: 8px double; width:50%">
    <form method="post" action="LoginController" style="margin-left:35%; margin-bottom:10%; margin-top:10%;">
        <h3>Login</h3>
       <small style="color:red">${falhalogin}</small><br>
        Login:
        <br>
        <input type="text" id="login" placeholder="Login" size="30" name="login">
        <br><br>

        Senha:
        <br>
        <input type="password" id="senha" placeholder="Senha" size="30" name="senha">
        <br><br>

        <button type="submit" id="enviar" class="btn btn-default">Entrar</button>
        <br>
    </form>
</div>

</body>


</html>
