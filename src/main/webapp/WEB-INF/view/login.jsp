<%-- 
    Document   : Login
    Created on : 16/11/2018, 16:04:12
    Author     : Marcelo
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid">  
        <form method="POST" action="LoginController" >
            <h3>Login</h3>
            <small style="color:red">${falhalogin}</small><br>
            Login:
            <br>
            <input type="text"  class="form-control" id="login" placeholder="Login" size="30" name="login">
            <br><br>

            Senha:
            <br>
            <input type="password"  class="form-control" id="senha" placeholder="Senha" size="30" name="senha">
            <br><br>

            <button type="submit" id="enviar" class="btn btn-default">Entrar</button>
            <br>
        </form>
    </div>
</div>

<c:import url="WEB-INF/view/footer.jsp" />
