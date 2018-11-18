<%-- 
    Document   : login
    Created on : 01/11/2018, 14:49:19
    Author     : Rafael
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <form method="POST" action="LoginController" style="margin-left:35%; margin-bottom:10%; margin-top:10%;">
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
  
<c:import url="WEB-INF/view/footer.jsp" />


