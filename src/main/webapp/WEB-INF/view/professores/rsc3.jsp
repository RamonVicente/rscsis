<%-- 
    Document   : rsc3
    Created on : 17/11/2018, 21:36:23
    Author     : ramon
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="WEB-INF/view/head.jsp" />
<br><br><br><br>
<div class="container" style=" border: 8px double; width:50%">
    <div class="container-fluid"> 
        <h2>PREENCHA O FORMULÁRIO RSC3:</h2>
        <small style="color:green">${cadastrado}</small>
        <form action="RSC3" method="POST">
            <table style="width:100%">
                <tr>
                    <th>CRITÉRIOS</th>
                    <th>QUANT. UNIDADE</th>
                </tr>
                <tr>
                    <td>Projeto Ligado à manutenção em equipamentos</td>
                    <td><input type="number" name="projeto_1" value="0"></td>
                </tr>
                <tr>
                    <td>Elaboração de documentos técnicos</td>
                    <td><input type="number" name="projeto_2" value="0"></td>
                </tr>
                <tr>
                    <td>Orientacao, tutoria, supervisão ou acompanhamento de atividade de pesqusia ou extensão</td>
                    <td><input type="number" name="elaboracao_documentos_tecnicos" value="0"></td>
                </tr>
            </table>
            <input type="hidden" name="id_usuario" value="<c:out value="${usuario.id}"/>">
            <button type="submit" id="Cadastrar" class="btn btn-default">Cadastrar</button>
            <a href="rsc1" class="btn btn-default">RSC1</a>
            <a href="rsc2" class="btn btn-default">RSC2</a>
            <a href="rsc3" class="btn btn-default">RSC3</a> 
        </form>
    </div>
</div>
<c:import url="WEB-INF/view/footer.jsp" />
