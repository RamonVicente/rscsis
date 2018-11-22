<%-- 
    Document   : home
    Created on : 21/11/2018, 22:44:51
    Author     : Marcelo
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid">  
        <h1>Olá ${usuario.nome}!</h1>
        <h2>Digite o Siape do Professor para começar a avaliação:</h2>
        <div class="form-group">
            <label>Siape:</label><br>
            <input type="text"  class="form-control" name="siape"size="30"><br>
            <button type="submit" class="btn btn-default">Enviar</button>
        </div>
        <br>
        <h5><a href="rsc1_ce">RSC1</a></h5>
        <h5><a href="rsc2_ce">RSC2</a></h5>
        <h5><a href="rsc3_ce">RSC3</a></h5>
    </div>
</div>
    </body>
</html>

<c:import url="WEB-INF/view/footer.jsp" />