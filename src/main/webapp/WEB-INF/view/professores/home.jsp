<%-- 
    Document   : home-professor
    Created on : 13/11/2018, 20:55:41
    Author     : ramon
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid"> 
        <h1>Ol� professor ${usuario.nome}!</h1>
        <h2>Escolha um dos RSCs abaixo:</h2>
        <br>
        <h5><a href="rsc1">RSC1</a></h5>
        <h5><a href="rsc2">RSC2</a></h5>
        <h5><a href="rsc3">RSC3</a></h5>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />