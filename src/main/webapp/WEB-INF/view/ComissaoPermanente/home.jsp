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
        <h1>Olá ${usuario.nome}!</h1>
        <h2>Digite o Siape do Professor para cadastrar os documentos:</h2>
        <div class="form-group">
            <label>Siape:</label><br>
            <input type="text"  class="form-control" name="siape"size="30"><br>
            <button type="submit" class="btn btn-default">Enviar</button>
        </div>
        <br>
        <h5><a href="rsc1_cp">RSC1</a></h5>
        <h5><a href="rsc2_cp">RSC2</a></h5>
        <h5><a href="rsc3_cp">RSC3</a></h5>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />