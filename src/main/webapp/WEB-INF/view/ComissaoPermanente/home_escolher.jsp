<%-- 
    Document   : home-escolher
    Created on : 01/12/2018
    Author     : valeria
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid">  
        
        <h2> Siape sendo editado ${siapeSendoEditado} nome: ${SiapeUser.nome}</h2><p>
            
        <h5><a href="rsc1_cp">RSC1</a></h5>
        <h5><a href="rsc2_cp">RSC2</a></h5>
        <h5><a href="rsc3_cp">RSC3</a></h5>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />