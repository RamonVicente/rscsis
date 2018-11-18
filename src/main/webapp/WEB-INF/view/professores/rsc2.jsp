<%-- 
    Document   : rsc2
    Created on : 17/11/2018, 21:20:31
    Author     : ramon
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<h2>PREENCHA O FORMULÁRIO RSC2:</h2>
<small style="color:green">${cadastrado}</small>
<form action="RSC2" method="POST">
    <table style="width:100%">
     <tr>
       <th>CRITÉRIOS</th>
       <th>QUANT. UNIDADE</th>
     </tr>
     <tr>
       <td>Orientação ou Coorientação de trabalho de conclusão de curso</td>
       <td><input type="number" name="orientacao_cooerientacao_tcc"></td>
     </tr>
     <tr>
       <td>Orientacao, tutoria, supervisão ou acompanhamento de atividade de ensino</td>
       <td><input type="number" name="orientacao_tutoria_supervisao_1"></td>
     </tr>
     <tr>
       <td>Orientacao, tutoria, supervisão ou acompanhamento de atividade de pesqusia ou extensão</td>
       <td><input type="number" name="orientacao_tutoria_supervisao_2"></td>
     </tr>
     <tr>
       <td>Orientação ou Coorientação de estagios curriculares</td>
       <td><input type="number" name="orientacao_tutoria_supervisao_3"></td>
     </tr>
     <tr>
       <td>Orientação ou Coorientação de educandos em atividade de ensino</td>
       <td><input type="number" name="orientacao_tutoria_supervisao_4"></td>
     </tr>
    </table>
    <input type="hidden" name="id_usuario" value="3">
    <button type="submit">Cadastrar</button>
</form>
<c:import url="WEB-INF/view/footer.jsp" />
