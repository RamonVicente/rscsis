<%-- 
    Document   : rsc3
    Created on : 17/11/2018, 21:36:23
    Author     : ramon
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<h2>PREENCHA O FORMUL�RIO RSC2:</h2>
<small style="color:green">${cadastrado}</small>
<form action="RSC3" method="POST">
    <table style="width:100%">
     <tr>
       <th>CRIT�RIOS</th>
       <th>QUANT. UNIDADE</th>
     </tr>
     <tr>
       <td>Projeto Ligado � manuten��o em equipamentos</td>
       <td><input type="number" name="projeto_1"></td>
     </tr>
     <tr>
       <td>Elabora��o de documentos t�cnicos</td>
       <td><input type="number" name="projeto_2"></td>
     </tr>
     <tr>
       <td>Orientacao, tutoria, supervis�o ou acompanhamento de atividade de pesqusia ou extens�o</td>
       <td><input type="number" name="elaboracao_documentos_tecnicos"></td>
     </tr>
    </table>
    <input type="hidden" name="id_usuario" value="1">
    <button type="submit">Cadastrar</button>
</form>
<c:import url="WEB-INF/view/footer.jsp" />
