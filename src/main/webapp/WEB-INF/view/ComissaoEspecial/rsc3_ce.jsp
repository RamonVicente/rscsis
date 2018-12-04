<%-- 
    Document   : rsc3_ce
    Created on : 21/11/2018, 22:45:46
    Author     : Marcelo
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid"> 
        <h2>PREENCHA O FORMULÁRIO RSC3:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="" method="POST">
            <table style="width:100%">
                <tr>
                    <th>CRITÉRIOS</th>
                    <th>QUANT. UNIDADE professor</th>
                    <th>QUANT. UNIDADE avaliador</th>
                </tr>
                <tr>
                    <td>Projeto Ligado à manutenção em equipamentos</td>
                    <td><input type="number" name="projeto_1_p" readonly></td>
                    <td><input type="number" name="projeto_1" value="0"></td>
                </tr>
                <tr>
                    <td>Elaboração de documentos técnicos</td>
                    <td><input type="number" name="projeto_2_p"  readonly></td>
                    <td><input type="number" name="projeto_2" value="0"> </td>
                </tr>
                <tr>
                    <td>Orientacao, tutoria, supervisão ou acompanhamento de atividade de pesqusia ou extensão</td>
                    <td><input type="number" name="elaboracao_documentos_tecnicos_p" readonly></td>
                    <td><input type="number" name="elaboracao_documentos_tecnicos" value="0"></td>

                </tr>
            </table>
            <input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}"/>">
            <button type="submit" id="Cadastrar" class="btn btn-default">Cadastrar</button>
            <a href="rsc1_ce" class="btn btn-default">RSC1</a>
            <a href="rsc2_ce" class="btn btn-default">RSC2</a>
            <a href="rsc3_ce" class="btn btn-default">RSC3</a>  
        </form>
    </div>
</div>

</html>
<c:import url="WEB-INF/view/footer.jsp" />